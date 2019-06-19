package com.daniinyan.todolist.integration;

import com.daniinyan.todolist.domain.Item;
import com.daniinyan.todolist.domain.ToDoList;
import com.daniinyan.todolist.repository.ToDoListRepository;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShowToDoListTest {

    @LocalServerPort
    private int port;

    @Autowired
    private ToDoListRepository toDoListRepository;

    @Before
    public void setUp() {
        RestAssured.port = port;
        RestAssured.baseURI = "http://localhost";
    }

    @Test
    public void mustSearchToDoList() {
        toDoListRepository.deleteAll();

        ToDoList testList = new ToDoList("Test List");
        ToDoList anotherTestList = new ToDoList("Another Test List");
        Item item1 = new Item("First item", testList);
        Item item2 = new Item("Second item", testList);

        toDoListRepository.save(testList);
        toDoListRepository.save(anotherTestList);

        RestAssured
                .get("/")
                .then()
                .body("name", Matchers.hasItems("Test List", "Another Test List"))
                .statusCode(HttpStatus.OK.value());

    }
}
