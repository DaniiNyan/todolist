package com.daniinyan.todolist.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "todolists")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "toDoList")
    private List<Item> items;

    public ToDoList() {
    }

    public ToDoList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
