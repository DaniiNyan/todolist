package com.daniinyan.todolist.controller;

import com.daniinyan.todolist.domain.Item;
import com.daniinyan.todolist.repository.ToDoListRepository;
import com.daniinyan.todolist.service.ToDoListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoListController {

    private ToDoListService toDoListService;

    public ToDoListController(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getItems() {


    }
}
