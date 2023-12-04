package com.salesianostriana.dam.rest.task.controller;

import com.salesianostriana.dam.rest.task.GetTaskDto;
import com.salesianostriana.dam.rest.task.model.Task;
import com.salesianostriana.dam.rest.task.repo.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;

    @GetMapping("/")
    public ResponseEntity<Optional<Task>> getAll() {
        try {
            Optional<Task> result = taskRepository.findAllTasks();
            if (result.isEmpty()) {
                throw new RuntimeException();
            }
            return ResponseEntity.ok(result);
        } catch (RuntimeException ex) {
            throw new RuntimeException("The tasks list is empty");
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id) {
        try {
            Optional<Task> result = taskRepository.findById(id);
            if (result.isEmpty()) {
                throw new RuntimeException();
            }
            return ResponseEntity.ok(result.get());
        } catch (RuntimeException ex) {
            throw new RuntimeException("The tasks does not exists");
        }
    }

    @GetMapping("/dto")
    public ResponseEntity<List<GetTaskDto>> getAllDto() {
        return null; // Modificar
    }


}
