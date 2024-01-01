package com.example.demo.dto.response;

import com.example.demo.domain.Tag;
import com.example.demo.domain.User;
import com.example.demo.domain.enums.TaskStatus;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class TaskOverviewResponseDTO {

    private Long id;
    private String title;
    private String description;
    private LocalDate creationDate;
    private LocalDate startDate;
    private LocalDate deadline;
    private TaskStatus status;
    private User createdBy;
    private User assignedTo;
    private Set<Tag> tags;
}
