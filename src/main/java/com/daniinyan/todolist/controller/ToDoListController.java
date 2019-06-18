package com.daniinyan.todolist.controller;

import com.daniinyan.todolist.repository.ToDoListRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {

    private ToDoListRepository toDoListRepository;

    public ToDoListController(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    @GetMapping
    public void getToDoList() {

    }
}
