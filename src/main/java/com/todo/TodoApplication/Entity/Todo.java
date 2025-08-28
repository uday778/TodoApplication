package com.todo.TodoApplication.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TodoTable")
public class Todo {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	private String taskContent;
	private Boolean completionStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public Boolean getCompletionStatus() {
		return completionStatus;
	}
	public void setCompletionStatus(Boolean completionStatus) {
		this.completionStatus = completionStatus;
	}
	
	
	
	

}
