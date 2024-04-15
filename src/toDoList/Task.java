package toDoList;

import java.sql.Time;

public class Task
{
	private String _name;
	private Type _taskType;
	private Time _deadline;
	
	public Task(String name)
	{
		_name = name;
		
	}
	
	public Task(String name, Type taskType)
	{
		_name = name;
		_taskType = taskType;
	}
	
	public Task(String name, Time deadline)
	{
		_name = name;
		_deadline = deadline;
	}
	
	public Task(String name, Type taskType, Time deadline)
	{
		_name = name;
		_taskType = taskType;
		_deadline = deadline;
	}
}
