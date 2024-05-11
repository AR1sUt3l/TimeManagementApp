package toDoList;

import java.sql.Time;
import java.util.ArrayList;

public class Task
{
	private String _name;
	private Type _taskType;
	private DueDate _deadline;
	private ListOfTasks _list = new ListOfTasks();
	
	public Task(String name)
	{
		_name = name;
	}
	
	public Task(String name, Type taskType)
	{
		_name = name;
		_taskType = taskType;
	}
	
	public Task(String name, DueDate deadline)
	{
		_name = name;
		_deadline = deadline;
	}
	
	public Task(String name, Type taskType, DueDate deadline)
	{
		_name = name;
		_taskType = taskType;
		_deadline = deadline;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public Type getTaskType()
	{
		return _taskType;
	}
	
	public DueDate getDeadline()
	{
		return _deadline;
	}
	
	public void setName(String newName)
	{
		_name = newName;
	}
	
	public void setTaskType(Type newTaskType)
	{
		_taskType = newTaskType;
	}
	
	public void setDeadline(DueDate newDeadline)
	{
		_deadline = newDeadline;
	}
	
}
