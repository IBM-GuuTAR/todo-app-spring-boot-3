package com.guutar.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guutar.todo.model.Todo;
import com.guutar.todo.repository.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository repo;

    public TodoService(TodoRepository repo) {
        this.repo = repo;
    }

    public List<Todo> getAll() {
        return repo.findAll();
    }

    public Todo add(Todo todo) {
        return repo.save(todo);
    }

    public void delete(int id) {
        repo.delete(id);
    }
}
