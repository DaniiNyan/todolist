package com.daniinyan.todolist.repository;

import com.daniinyan.todolist.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
