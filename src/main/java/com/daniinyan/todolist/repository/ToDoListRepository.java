package com.daniinyan.todolist.repository;

import com.daniinyan.todolist.domain.ToDoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends CrudRepository<ToDoList, Long> {

}
