package com.example.demo.dto.response;

import com.example.demo.domain.enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskResponseDTO {

    private Long id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate deadline;
    private TaskStatus taskStatus;

    private String status; //("success" or "error")
    private String message;

    public TaskResponseDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
