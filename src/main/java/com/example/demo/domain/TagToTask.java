package com.example.demo.domain;
import jakarta.persistence.*;
import lombok.*;
import java.util.Objects;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "tags_to_tasks")
public class TagToTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

}
