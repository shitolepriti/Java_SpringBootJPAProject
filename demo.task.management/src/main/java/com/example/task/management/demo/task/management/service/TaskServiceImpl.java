package com.example.task.management.demo.task.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.management.demo.task.management.entity.Task;
import com.example.task.management.demo.task.management.repository.TaskRepository;
@Service
public class TaskServiceImpl implements TaskServices{
@Autowired
	private TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	@Override
	public Task saveTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}

	@Override
	public List<Task> TaskList() {
		// TODO Auto-generated method stub
		List<Task>findAll=taskRepository.findAll();
		
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		taskRepository.deleteById(id);
	}

	@Override
	public Task findById(int id) {
		// TODO Auto-generated method stub
		Optional<Task>findById=taskRepository.findById(id);
		Task task=findById.get();
		
		return task;
	}

	@Override
	public Task updateTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}

}
