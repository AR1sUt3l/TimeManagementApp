package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class Type implements SortByAlphabet
{
	private static ArrayList<String> _listOfTypes = new ArrayList<>();
	private String _type;
	
	public Type()
	{
		_type = "General";
	}
	
	public Type(String type)
	{
		_type = type;
		addNewType(type);
	}
	
	public String getType()
	{
		return _type;
	}
	
	public void setType(String type)
	{
		_type = type;
	}
	
	public void addNewType(String type)
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
