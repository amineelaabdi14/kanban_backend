package com.example.demo.services;

import com.example.demo.dto.request.TagsRequestDTO;
import com.example.demo.dto.response.TagsResponseDTO;

import java.util.List;

public interface TagsService {
    TagsResponseDTO createTags(TagsRequestDTO tagsRequestDTO);
    TagsResponseDTO getTags(Long id);
    List<TagsResponseDTO> getAllTags();
    TagsResponseDTO updateTags(Long id, TagsRequestDTO tagsRequestDTO);
    void deleteTags(Long id);
}
