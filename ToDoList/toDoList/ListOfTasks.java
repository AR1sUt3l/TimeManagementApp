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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ListOfTasks implements SortByAlphabet
{
	private static LinkedList<Task> defaultList = new LinkedList<>();
	private static LinkedList<Task> tempList = new LinkedList<>();
	private static HashMap<Type, Task> typeID = new HashMap<>();
	private static ArrayList<Task> completedList = new ArrayList<>();
	
	/**
	 * Adds task to one of the lists depending on whether they were completed
	 * @param task to add
	 */
	public void addTask(Task task)
	{
		if (task.getCompletionStatus())
		{
			completedList.add(task);
		}
		else
		{
			defaultList.add(task);
			tempList.add(task);
			typeID.put(task.getTaskType(), task);
		}
	}
	
	/**
	 * Removes task from the list
	 * @param task
	 */
	public void removeTask(Task task)
	{
		defaultList.remove(task);
		tempList.remove(task);
	}
	
	@Override
	/**
	 * Sorts the list of tasks based on the alphabetic order of their name
	 */
	public void sortAlphabetically()
	{
		while (!isInOrderAlphabetically())
		{
			for(int i = 0; i < tempList.size() - 1; i++)
			{
				if (tempList.get(i).getName().compareTo(tempList.get(i+1).getName()) > 0)
				{
					Task tempTask = tempList.get(i);
					tempList.add(i, tempList.get(i+1));
					tempList.add(i+1, tempTask);
				}
			}
		}
	}
	
	/**
	 * Checks whether the tasks are in order
	 * @return
	 */
	public boolean isInOrderAlphabetically()
	{
		boolean isInOrder = true;
		for(int i = 0; i < tempList.size() - 1; i++)
		{
			if (tempList.get(i).getName().compareTo(tempList.get(i+1).getName()) > 0)
			{
				isInOrder = false;
			}
		}
		return isInOrder;
	}
	
	/**
	 * 
	 * @return list of completed tasks
	 */
	public ArrayList<Task> getCompletedTask()
	{
		return completedList;
	}
	
	/**
	 * @return list
	 */
	public String toString()
	{
		String str = "";
		for(int i = 0; i < defaultList.size(); i++)
		{
			str += "---------------------" +
				   "\n Task Name: " + defaultList.get(i).getName() +
				   "\n Type: " + defaultList.get(i).getTaskType() +
				   "\n Deadline: " + defaultList.get(i).getDeadline() +
				   "\n Completion Status: " + defaultList.get(i).getCompletionStatus() +
				   "\n---------------------";
		}
		return str;
	}
}
