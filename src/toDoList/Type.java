package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class Type implements SortByAlphabet
{
	private static ArrayList<String> _listOfTypes = new ArrayList<>();
	private String _type;
	private static final String DEFAULT_TYPE = "General";
	
	public Type()
	{
		_type = DEFAULT_TYPE;
		addNewType(_type);
	}
	
	public Type(String type)
	{
		type = formatWord(type);
		_type = type;
		addNewType(DEFAULT_TYPE);
		addNewType(_type);
	}
	
	public String getType()
	{
		return _type;
	}
	
	public void setType(String type)
	{
		if (_type != DEFAULT_TYPE)
		{
			_listOfTypes.remove(_type);
		}
		_type = type;
		addNewType(type);
	}
	
	public String formatWord(String word)
	{
		word = word.toLowerCase();
		for(int i = 0; i < word.length(); i++)
		{
			if(i == 0 || word.charAt(i - 1) == ' ')
			{
				word = word.replaceFirst(word.substring(i, i + 1), word.substring(i, i + 1).toUpperCase());
			}
		}
		return word;
	}
	
	public void addNewType(String type)
	{
		boolean isInList = false;
		if(_listOfTypes.isEmpty())
		{
			_listOfTypes.add(type);
		}
		else if(_listOfTypes.size() == 1)
		{
			if(_listOfTypes.get(0) != type)
			{
				_listOfTypes.add(type);
			}
		}
		else
		{
			for (int i = 0; i < _listOfTypes.size(); i++)
			{
				if(type == _listOfTypes.get(i))
				{
					isInList = true;
				}
			}
			if(isInList == false)
			{
				_listOfTypes.add(type);
			}
		}
	}
	
	public String toString()
	{
		if(_listOfTypes.isEmpty())
		{
			return null;
		}
		String str = _listOfTypes.get(0);
		if(_listOfTypes.size() > 1)
		{
			for (int i = 1; i < _listOfTypes.size(); i++)
			{
				str += ", " + _listOfTypes.get(i);
			}
		}
		return str;
	}

	@Override
	public void sortAlphabetically()
	{
//		String[] list = new String[_listOfTypes.size()];
//		list[0] = _listOfTypes.get(0);
		_listOfTypes.remove(0);
//		for(int i = 1; i < _listOfTypes.size() - 1; i++)
//		{
//			if(_listOfTypes.get(i).charAt(0) > _listOfTypes.get(i + 1).charAt(0))
//			{
//				Collections.swap(_listOfTypes, i, i + 1);
//			}
//		}
		Collections.sort(_listOfTypes);
		_listOfTypes.add(0, DEFAULT_TYPE);
	}
}
