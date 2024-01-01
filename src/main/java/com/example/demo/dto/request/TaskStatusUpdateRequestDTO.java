package com.example.demo.dto.request;

import lombok.Data;

@Data
public class TaskStatusUpdateRequestDTO {
    private Long taskId;
    private Long userId;
}
