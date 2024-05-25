package toDoList;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

public class ListOfTypes implements SortByAlphabet
{
	private static final String DEFAULT_TYPE = "General";
	private static ArrayList<String> _list = new ArrayList<>();
	
	public ListOfTypes()
	{
		_list.add(DEFAULT_TYPE);
		_list.add("New Type");
	}
	
	/**
	 * Updates TypesList.txt
	 * @throws IOException when file cannot be found
	 */
	public void updateTextFile() throws IOException
	{
		File listFile = new File("textFiles/TypesList.txt");
		if (!listFile.exists())
		{
			System.out.println("Error: File Not Found");
			System.exit(0);
		}
		PrintWriter writeFile = new PrintWriter(listFile);
		for (int i = 0; i < _list.size(); i++)
		{
			writeFile.println(_list.get(i));
		}
		writeFile.close();
	}
	
	/**
	 * Updates List with data from TypesList.txt
	 * @throws IOException when file cannot be found
	 */
	public void updateList() throws IOException
	{
		File listFile = new File("textFiles/TypesList.txt");
		if (!listFile.exists())
		{
			System.out.println("Error: File Not Found");
			System.exit(0);
		}
		Scanner readFile = new Scanner(listFile);
		while (readFile.hasNext())
		{
			_list.add(readFile.nextLine());
		}
		readFile.close();
	}
	
	/**
	 * Adds type to the list if it is not on the list
	 * @param newType
	 */
	public void addType(String newType)
	{
		boolean isInList = false;
		if(_list.isEmpty())
		{
			_list.add(newType);
		}
		else if(_list.size() == 1)
		{
			if(_list.get(0) != newType)
			{
				_list.add(newType);
			}
		}
		else
		{
			for (int i = 0; i < _list.size(); i++)
			{
				if(newType == _list.get(i))
				{
					isInList = true;
				}
			}
		}
		if(isInList == false)
		{
			_list.add(newType);
		}
	}
	
	/**
	 * Removes type on the list
	 * @param type
	 */
	public void removeType(String type)
	{
		_list.remove(type);
	}
	
	/**
	 * 
	 * @return list as a String array
	 */
	public String[] getList()
	{
		String[] list = new String[_list.size()];
		for (int i = 0; i < _list.size(); i++)
		{
			list[i] = _list.get(i);
		}
		return list;
	}
	
	/**
	 * Gets the types in the list
	 */
	public String toString()
	{
		if(_list.isEmpty())
		{
			return null;
		}
		String str = _list.get(0);
		if(_list.size() > 1)
		{
			for (int i = 1; i < _list.size(); i++)
			{
				str += ", " + _list.get(i);
			}
		}
		return str;
	}

	@Override
	/**
	 * Sorts the list alphabetically
	 */
	public void sortAlphabetically()
	{
		_list.remove(0);
		Collections.sort(_list);
		_list.add(0, DEFAULT_TYPE);
	}
}
