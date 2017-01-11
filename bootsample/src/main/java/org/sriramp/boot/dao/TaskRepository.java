package org.sriramp.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.sriramp.boot.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
