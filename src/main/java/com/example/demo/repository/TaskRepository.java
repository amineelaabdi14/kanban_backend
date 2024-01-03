package com.example.demo.repository;

import com.example.demo.domain.Task;
import com.example.demo.domain.enums.TaskStatus;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByAssignedTo(User user);
    List<Task> findByStatus(TaskStatus status);

    @Query("SELECT t FROM Task t WHERE t.deadline < :currentDate AND t.status <> 'EXPIRED'")
    List<Task> findTasksToExpire(LocalDate currentDate);

}
