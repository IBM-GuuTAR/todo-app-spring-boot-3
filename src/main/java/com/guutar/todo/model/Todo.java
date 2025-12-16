package com.guutar.todo.model;

public class Todo {
    private int id;
    private String title;
    private boolean done;

    public Todo() {}

    public Todo(int id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isDone() { return done; }
    public void setDone(boolean done) { this.done = done; }
}
