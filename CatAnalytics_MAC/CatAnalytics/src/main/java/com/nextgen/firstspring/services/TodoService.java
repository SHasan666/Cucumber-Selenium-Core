package com.nextgen.firstspring.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nextgen.firstspring.model.Todo;

@Service
public class TodoService {


    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "sakibhasan.net@gmail.com", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "sakibhasan.net@gmail.com", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "sakibhasan.net@gmail.com", "Learn Hibernate", new Date(),
                false));
        todos.add(new Todo(1, "zerin", "Learn CPA", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public void addTodo(String name, String desc, Date targetDate,
            boolean isDone) {
        todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
}
