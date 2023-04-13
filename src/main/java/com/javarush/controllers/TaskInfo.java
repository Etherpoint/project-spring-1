package com.javarush.controllers;

import com.javarush.domain.Status;

public class TaskInfo {
    private String description;
    private Status status;

    public String getDescription() {
        return description;
    }

    @SuppressWarnings("unused")
    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    @SuppressWarnings("unused")
    public void setStatus(Status status) {
        this.status = status;
    }
}
