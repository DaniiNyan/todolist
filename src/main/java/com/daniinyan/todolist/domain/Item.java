package com.daniinyan.todolist.domain;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_toDoList")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ToDoList toDoList;

    public Item() {
    }

    public Item(String name, ToDoList toDoList) {
        this.name = name;
        this.toDoList = toDoList;
    }

    public ToDoList getToDoList() {
        return toDoList;
    }

    public void setToDoList(ToDoList toDoList) {
        this.toDoList = toDoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
