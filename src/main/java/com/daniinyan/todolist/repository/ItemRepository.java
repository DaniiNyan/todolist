package com.daniinyan.todolist.repository;

import com.daniinyan.todolist.domain.Item;
import com.daniinyan.todolist.domain.ToDoList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {


    List<Item> findByToDoList(ToDoList toDoList);


    @Query(" select item from Item item " +
            " inner join toDoList tod " +
            " where tod.id = :idTodoList ")
    List<Item> findByDaniela(@Param("idTodoList") Long idTodoList);
}
