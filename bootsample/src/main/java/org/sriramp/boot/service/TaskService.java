package org.sriramp.boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.sriramp.boot.dao.TaskRepository;
import org.sriramp.boot.model.Task;

@Service
@Transactional
public class TaskService {
	
	private final TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository)
	{
		this.taskRepository = taskRepository;
	}
	
	public List<Task> findAll()
	{
		List<Task> tasks = new ArrayList<>();
		
		for(Task task: taskRepository.findAll())
		{
			tasks.add(task);
		}
		
		return tasks;
	}

}
