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
	
	public void removeType(String type)
	{
		_list.remove(type);
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
		_list.remove(0);
		Collections.sort(_list);
		_list.add(0, DEFAULT_TYPE);
	}
}
