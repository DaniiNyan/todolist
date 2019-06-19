package com.daniinyan.todolist.service;

import com.daniinyan.todolist.domain.Item;
import com.daniinyan.todolist.domain.ToDoList;
import com.daniinyan.todolist.repository.ItemRepository;
import com.daniinyan.todolist.repository.ToDoListRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoListService {
    private ToDoListRepository toDoListRepository;
    private ItemRepository itemRepository;

    public ToDoListService(ToDoListRepository toDoListRepository, ItemRepository itemRepository) {
        this.toDoListRepository = toDoListRepository;
        this.itemRepository = itemRepository;
    }

    public List<ToDoList> getLists() {
//        List<ToDoList> toDoLists = toDoListRepository.findAll();
//        List<String> toDoListsNames = new ArrayList<>();
//
//        for (ToDoList toDoList : toDoLists) {
//            toDoListsNames.add(toDoList.getName());
//        }

        return toDoListRepository.findAll();
    }

    public List<Item> listItems(ToDoList toDoList) {


        return null;
    }
}
