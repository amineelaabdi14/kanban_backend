package com.example.demo.services;



import com.example.demo.dto.request.*;
import com.example.demo.dto.response.TaskOverviewResponseDTO;
import com.example.demo.dto.response.TaskResponseDTO;

import java.util.List;

public interface TaskService {

    TaskResponseDTO createTask(TaskRequestDTO taskRequestDTO);

    TaskResponseDTO assignTaskToUser(Long id, TaskUpdateRequestDTO taskUpdateRequestDTO);

    TaskResponseDTO assignTaskToSelf(TaskAssignmentRequestDTO assignmentDTO);

    TaskResponseDTO updateTaskStatusToDone(TaskStatusUpdateRequestDTO requestDTO);

    TaskResponseDTO deleteTaskCreatedByMe(TaskDeletionRequestDTO deletionRequestDTO);

    List<TaskOverviewResponseDTO> getAllTasks();



}
