package com.javarush.domain;

import jakarta.persistence.*;


@SuppressWarnings({"unused", "JpaDataSourceORMInspection"})
@Entity
@Table(schema = "todo")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;
    @Column(name = "status", columnDefinition = "IN_PROGRESS, DONE, PAUSED")
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
