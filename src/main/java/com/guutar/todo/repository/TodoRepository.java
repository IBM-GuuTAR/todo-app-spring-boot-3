package com.guutar.todo.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.guutar.todo.model.Todo;

@Repository
public class TodoRepository {

    private final JdbcTemplate jdbc;

    public TodoRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Todo> findAll() {
        return jdbc.query("SELECT * FROM todos", (rs, rowNum) ->
                new Todo(rs.getInt("id"),
                        rs.getString("title"),
                        rs.getBoolean("done")));
    }

    public Todo save(Todo todo) {
        jdbc.update("INSERT INTO todos (title, done) VALUES (?, ?)",
                todo.getTitle(), todo.isDone());
        return todo;
    }

    public void delete(int id) {
        jdbc.update("DELETE FROM todos WHERE id = ?", id);
    }
}
