package toDoList;

/**
 * Lead Author(s):
 * @author Aleczandria Villagracia
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 05.24.2024.01
 * 
 * Responsibilities of class:
 * 
 */

public class Task
{
	private String _name;
	private Type _taskType = new Type();
	private DueDate _deadline = new DueDate("");
	private boolean isCompleted = false;
	
	public Task(String name) throws NameNotFoundException
	{
		if (name == "")
		{
			throw new NameNotFoundException();
		}
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
	
	/**
	 * 
	 * @return name of task
	 */
	public String getName()
	{
		return _name;
	}
	
	/**
	 * 
	 * @return type of task
	 */
	public Type getTaskType()
	{
		return _taskType;
	}
	
	/**
	 * 
	 * @return deadline of task
	 */
	public DueDate getDeadline()
	{
		return _deadline;
	}
	
	/**
	 * Sets name of task to new name
	 * @param newName
	 */
	public void setName(String newName)
	{
		_name = newName;
	}
	
	/**
	 * Sets type of task to new type
	 * @param newTaskType
	 */
	public void setTaskType(Type newTaskType)
	{
		_taskType = newTaskType;
	}
	
	/**
	 * Sets deadline of task to new deadline
	 * @param newName
	 */
	public void setDeadline(DueDate newDeadline)
	{
		_deadline = newDeadline;
	}
	
	/**
	 * 
	 * @return whether task is completed
	 */
	public boolean getCompletionStatus()
	{
		return isCompleted;
	}
	
	/**
	 * Sets task as completed
	 */
	public void setToCompleted()
	{
		isCompleted = true;
	}
	
	/**
	 * String that contains information of task
	 */
	public String toString()
	{
		String str = "";
		str += "-----------------------------" +
			   "\n Task Name: " + getName() +
			   "\n Type: " + getTaskType() +
			   "\n Deadline: " + getDeadline() +
			   "\n Completion Status: " + getCompletionStatus() +
			   "\n-----------------------------";
		return str;
	}
	
}
