package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class Type implements SortByAlphabet
{
	private static ArrayList<String> _listOfTypes = new ArrayList<>();
	private String _type;
	
	private static String[] _list = new String[]
	{
		"English", "Mathematics", "Science", "Language", "Humanities", "Economics",
		"History", "Communication"
	};
	
	public Type()
	{
		_type = "General";
	}
	
	public Type(String type)
	{
		_type = type;
		addNewSubject(type);
	}
	
	public String getSubject()
	{
		return _type;
	}
	
	public void setSubject(String type)
	{
		_type = type;
	}
	
	public void addNewSubject(String type)
	{
		type.toLowerCase();
		type.substring(0, 0).toUpperCase();
		for (int i = 0; i < _listOfTypes.size(); i++)
		{
			if(type != _listOfTypes.get(i))
			{
				_listOfTypes.add(type);
			}
		}
	}

	@Override
	public void sortAlphabetically()
	{
		for(int i = 0; i < _listOfTypes.size(); i++)
		{
			for(int j = 0; j < _listOfTypes.get(i).length(); j++)
			{
				if(_listOfTypes.get(i).charAt(j) < _listOfTypes.get(i).charAt(j))
				{
					Collections.swap(_listOfTypes, i, i + 1);
				}
			}
		}
	}
}
