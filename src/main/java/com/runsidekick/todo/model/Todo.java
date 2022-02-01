package com.runsidekick.todo.model;

import javax.validation.constraints.NotNull;

/**
 * @author tolgatakir
 */
public class Todo {
    private Long id;
    @NotNull(message = "Title cannot be null")
    private String title;
    private boolean completed;

    public Todo() {
    }

    public Todo(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
