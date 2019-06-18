package com.daniinyan.todolist.domain;

import javax.persistence.*;

@Entity
@Table(name = "todolists")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

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
}
