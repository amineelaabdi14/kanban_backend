package com.example.demo.repository;


import com.example.demo.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.HTML;

public interface TagsRepository extends JpaRepository<Tag, Long> {

}
