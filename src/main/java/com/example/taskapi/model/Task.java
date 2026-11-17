package com.example.taskapi.model;

import java.time.LocalDateTime;

/**
 * 一条待办任务。
 */
public class Task {

    private Long id;
    private String title;
    private boolean done;
    private LocalDateTime createdAt;

    public Task() {
    }

    public Task(Long id, String title, boolean done, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.done = done;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
