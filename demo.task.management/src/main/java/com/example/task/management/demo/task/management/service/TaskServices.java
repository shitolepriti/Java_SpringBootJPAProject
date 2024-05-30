package com.example.task.management.demo.task.management.service;

import java.util.List;



import com.example.task.management.demo.task.management.entity.Task;

public interface TaskServices {

	public Task saveTask(Task task);
	public List<Task>TaskList();
	public void deleteById(int id);
	public Task findById(int id);
	public Task updateTask(Task task);
}
