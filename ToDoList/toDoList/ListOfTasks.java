package toDoList;

import java.util.HashMap;
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
	
	public void removeTask(Task task)
	{
		_defaultList.remove(task);
	}
	
	@Override
	public void sortByType()
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < _defaultList.size(); i++)
		{
//			if (_defaultList.get(i).getTaskType() == )
		}
	}

	@Override
	public void sortByDeadline()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortAlphabetically()
	{
		for(int i = 0; i < _defaultList.size(); i++)
		{
			
		}
		
	}
	
	public String toString()
	{
		return "";
	}
}
