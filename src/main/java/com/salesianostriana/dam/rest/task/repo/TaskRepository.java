package com.salesianostriana.dam.rest.task.repo;

import com.salesianostriana.dam.rest.task.GetTaskDto;
import com.salesianostriana.dam.rest.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query("""
            SELECT com.salesianostriana.dam.rest.task.GetTaskDto(
                t.id,
                t.title,
                t.deadline
            )
            FROM Task t
            """)
    Optional<Task> findAllTasks();
}
