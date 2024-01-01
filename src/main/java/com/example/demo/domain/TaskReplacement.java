package com.example.demo.domain;

import com.example.demo.domain.enums.TaskAction;
import com.example.demo.domain.enums.TaskReplacementStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class TaskReplacement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "old_user_id")
    private User oldUser;

    @ManyToOne
    @JoinColumn(name = "new_user_id")
    private User newUser;

    @Enumerated(EnumType.STRING)
    private TaskAction action;

    @Enumerated(EnumType.STRING)
    private TaskReplacementStatus status;
}