package toDoList;

import java.util.LinkedList;

public class ListOfTasks implements SortByAlphabet, SortByDeadline, SortByType
{
	private static LinkedList<Task> _defaultList = new LinkedList<>();
	private static LinkedList<Task> _tempList = new LinkedList<>();
	
	public void addTask(Task task)
	{
		_defaultList.add(task);
		_tempList.add(task);
	}
	
	@Override
	public void sortByType()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByDeadline()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortAlphabetically()
	{
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "";
	}
}
