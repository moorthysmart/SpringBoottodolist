package com.Moorthy.SpringbootTodoApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.Moorthy.SpringbootTodoApplication.Taskentites;


public interface TaskRepository extends CrudRepository<Taskentites, Integer> {

}
