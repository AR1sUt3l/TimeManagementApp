package toDoList;

import java.util.LinkedList;

public class ListOfTasks implements SortByAlphabet, SortByDeadline, SortByType
{
	private LinkedList<Task> _list = new LinkedList<>();
	
	public ListOfTasks(Task task)
	{
		
	}

	@Override
	public Type[] getListOfTypes()
	{
		// TODO Auto-generated method stub
		return null;
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
}
