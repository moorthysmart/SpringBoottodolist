package com.Moorthy.SpringbootTodoApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Moorthy.SpringbootTodoApplication.repository.TaskRepository;

@RestController
public class Taskcontroller 
{
	@Autowired
	TaskRepository repo;
	

    @RequestMapping(value="/alltask",method=RequestMethod.GET)
    public List<Taskentites> getalltask(){

        return(List<Taskentites>) repo.findAll();
    }
    
    @RequestMapping(value="/createtask")
    @PostMapping
    public Taskentites createtask(@RequestBody Taskentites taskentites) {

        return repo.save(taskentites);
    }
    
    @RequestMapping(value="/updatetask")
    @PostMapping
    public Taskentites updatetask(@RequestBody Taskentites taskentites) {

        return repo.save(taskentites);
    }
    
    @RequestMapping(value="/deleteonetask/{taskno}")
    @PostMapping
    public String deleteonetask(@PathVariable int taskno) {

        repo.deleteById(taskno);
        return"Task is deleted"; 
    }
    
    @RequestMapping(value="/getonetask/{taskno}")
    @PostMapping
    public Optional<Taskentites> getonetask(@PathVariable int taskno) {
   	
        return repo.findById(taskno); 
    }

}
