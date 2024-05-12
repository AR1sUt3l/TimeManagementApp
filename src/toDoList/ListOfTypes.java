package toDoList;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListOfTypes implements SortByAlphabet
{
	private static final String DEFAULT_TYPE = "General";
	private static ArrayList<String> _list = new ArrayList<>();
	
	public void updateTextFile() throws IOException
	{
		
	}
	
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
	
	public void addTask(Task task)
	{
		
	}
	
	public ArrayList<String> getList()
	{
		return _list;
	}
	
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
	public void sortAlphabetically()
	{
//		String[] list = new String[_listOfTypes.size()];
//		list[0] = _listOfTypes.get(0);
		_list.remove(0);
//		for(int i = 1; i < _listOfTypes.size() - 1; i++)
//		{
//			if(_listOfTypes.get(i).charAt(0) > _listOfTypes.get(i + 1).charAt(0))
//			{
//				Collections.swap(_listOfTypes, i, i + 1);
//			}
//		}
		Collections.sort(_list);
		_list.add(0, DEFAULT_TYPE);
	}
}
