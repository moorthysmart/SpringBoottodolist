package com.Moorthy.SpringbootTodoApplication;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaskdataEntites 
{   
	@Id
	private int taskno;

	private String taskname;
	private boolean taskcomplete;

	public TaskdataEntites() {
		super();
	}
	public TaskdataEntites(int taskno, String taskname, boolean taskcomplete) {
		super();
		this.taskno = taskno;
		this.taskname = taskname;
		this.taskcomplete = taskcomplete;
	}
	public int getTaskno() {
		return taskno;
	}
	public void setTaskno(int taskno) {
		this.taskno = taskno;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public boolean isTaskcomplete() {
		return taskcomplete;
	}
	public void setTaskcomplete(boolean taskcomplete) {
		this.taskcomplete = taskcomplete;
	}
	@Override
	public String toString() {
		return "Entites [taskno=" + taskno + ", taskname=" + taskname + ", taskcomplete=" + taskcomplete + "]";
	}

	
	

}
