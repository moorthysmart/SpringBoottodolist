package com.Moorthy.SpringbootTodoApplication;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class frontcontroller 
{
	@Autowired
	private Repostory repo;
	
	@RequestMapping("/home")
	public String home() {
		
		return"home";
	}
	@RequestMapping("/addtask")
	public String getdata() {
		
		return"Addtask";
	}

	@RequestMapping("/gettask")
	public String getdata(TaskdataEntites data) {
		repo.save(data);
		return"Addtask";
	}
	@RequestMapping("/getontask")
	public String getdetails() {
		return"viewalltask";
	}
	
	@PostMapping("/gettaskdata")
	public ModelAndView viewdetails(@RequestParam(name="taskno")int taskno)
	{
		ModelAndView mv=new ModelAndView("gettask");
		
		TaskdataEntites datass=repo.findById(taskno).orElse(null);
		mv.addObject("datass",datass);
	
		System.out.println(datass);
		return mv;
		
	}
	@RequestMapping("/deleteontask")
	public String deletetaskdetails() {
		return"deleteonetask";
	}
	@PostMapping("/deletetaskdata")
	public String deletetask(@RequestParam(name="taskno")int taskno)
	{
		repo.deleteById(taskno);
		return "deletetask";
		
	}
	@GetMapping("/alltaskdata")
	public ModelAndView alltaskdata()
	{
		List<TaskdataEntites> alldata=(List<TaskdataEntites>) repo.findAll();
		
		    ModelAndView mv= new ModelAndView("alltask");
		    mv.addObject("alldata",alldata);
			return mv;
	}
	@RequestMapping("/updateontask")
	public String updatetaskdetails() {
		return"updatetask";
	}
	
	@PostMapping("/updatetaskdata")
	public String updatetask(@RequestParam(name="taskno")int taskno,@RequestParam(name="taskname")String taskname,@RequestParam(name="taskcomplete")Boolean taskcomplete)
	{
		List<TaskdataEntites> l=(List<TaskdataEntites>) repo.findAll();
		for (TaskdataEntites t : l) {
		
		t.setTaskno(taskno);
		t.setTaskcomplete(taskcomplete);
		t.setTaskname(taskname);
		repo.saveAll(l);
		}
		
		return "updatetaskview";
	}

}
