package com.todo.TodoApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.TodoApplication.Entity.Todo;
import com.todo.TodoApplication.repository.TODORepository;

@Service
public class TODOService {
	
	@Autowired
	TODORepository todoRepository;
	
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}
	
	public List<Todo> getAllTodos(){
		return todoRepository.findAllTodos();
	}
	
	public void updateTodo(long id,Todo newTodo) {
		Optional<Todo> todoOldBox =todoRepository.findById(id);
		if(todoOldBox.isPresent()) {
			Todo oldTodo=todoOldBox.get();
			oldTodo.setTaskContent(newTodo.getTaskContent());
			oldTodo.setCompletionStatus(newTodo.getCompletionStatus());
			todoRepository.updateTodo(oldTodo);
		}
	}
	
	public void deleteTodo(Long id) {
		todoRepository.deleteTODOById(id);
	}

}
