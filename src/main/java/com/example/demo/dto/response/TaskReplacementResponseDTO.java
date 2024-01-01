package com.example.demo.dto.response;

import com.example.demo.domain.enums.TaskAction;
import com.example.demo.domain.enums.TaskReplacementStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskReplacementResponseDTO {
    private Long id;
    private Long taskId;
    private LocalDateTime dateTime;
    private Long oldUserId;
    private Long newUserId;
    private TaskAction action;
    private TaskReplacementStatus taskReplacementStatus;
    private String status;
    private String message;

    public TaskReplacementResponseDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
