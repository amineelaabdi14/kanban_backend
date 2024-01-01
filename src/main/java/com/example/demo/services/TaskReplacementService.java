package com.example.demo.services;


import com.example.demo.dto.request.ApproveTaskReplacementRequestDTO;
import com.example.demo.dto.request.RejectTaskReplacementRequestDTO;
import com.example.demo.dto.request.TaskReplacementRequestDTO;
import com.example.demo.dto.response.TaskReplacementResponseDTO;

public interface TaskReplacementService {
    TaskReplacementResponseDTO createDeleteTaskReplacement(TaskReplacementRequestDTO requestDTO);
    TaskReplacementResponseDTO createEditTaskReplacement(TaskReplacementRequestDTO requestDTO);
    TaskReplacementResponseDTO approveTaskReplacement(ApproveTaskReplacementRequestDTO requestDTO);
    TaskReplacementResponseDTO rejectTaskReplacement(RejectTaskReplacementRequestDTO requestDTO);
}
