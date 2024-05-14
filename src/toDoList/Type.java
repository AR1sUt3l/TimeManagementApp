package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class Type
{
	private static ListOfTypes _listOfTypes = new ListOfTypes();
	private String _type;
	protected static final String DEFAULT_TYPE = "General";
	
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
			_listOfTypes.removeType(_type);
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
		if(_listOfTypes.getList().isEmpty())
		{
			_listOfTypes.getList().add(type);
		}
		else if(_listOfTypes.getList().size() == 1)
		{
			if(_listOfTypes.getList().get(0) != type)
			{
				_listOfTypes.getList().add(type);
			}
		}
		else
		{
			for (int i = 0; i < _listOfTypes.getList().size(); i++)
			{
				if(type == _listOfTypes.getList().get(i))
				{
					isInList = true;
				}
			}
			if(isInList == false)
			{
				_listOfTypes.getList().add(type);
			}
		}
	}
	
	
}
