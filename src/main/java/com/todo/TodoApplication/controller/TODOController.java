package com.todo.TodoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todo.TodoApplication.Entity.Todo;
import com.todo.TodoApplication.service.TODOService;

@Controller
public class TODOController {
	
	@Autowired
	TODOService todoService;

	@RequestMapping( value="/addtodo",method = RequestMethod.POST )
	public String createTodo(@ModelAttribute Todo todo) {
			todoService.saveTodo(todo);
			return "redirect:/";
	}
	
	
	
	@RequestMapping(value = "/updatetodo/{id}", method = RequestMethod.POST)
	public String updateTodo(@PathVariable Long id, @ModelAttribute Todo todo) {
		todoService.updateTodo(id,todo);
		return "redirect:/";
	}

	
	@RequestMapping(value = "/deletetodo/{id}")
	public String deleteTodo(@PathVariable("id") Long id) {
		todoService.deleteTodo(id);
		return "redirect:/";
	}

	@RequestMapping("/")
	public String getAllTodos(Model model) {
		List<Todo>listOfTodos=todoService.getAllTodos();
		model.addAttribute("listoftodos",listOfTodos);
		return "todo";
	}

}
