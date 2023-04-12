package org.example.domain;

import jakarta.persistence.*;


@SuppressWarnings({"unused", "JpaDataSourceORMInspection"})
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    private String description;
    @Column(name = "status", columnDefinition = "IN_PROGRESS, DONE, PAUSED")
    private Status status;
}
