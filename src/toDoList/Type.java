package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class Type
{
	private static ArrayList<String> _listOfTypes = new ArrayList<>();
	private String _type;
	
	private static void defaultList() // to be updated
	{
		_listOfTypes.add("General");
		_listOfTypes.add("English");
		_listOfTypes.add("Mathematics");
		_listOfTypes.add("Science");
		_listOfTypes.add("Language");
		_listOfTypes.add("Humanities");
		_listOfTypes.add("Economics");
		_listOfTypes.add("History");
		_listOfTypes.add("Communication");
		Collections.sort(_listOfTypes);
	}
	
	public Type()
	{
		_type = _listOfTypes.get(0);
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
		Collections.sort(_listOfTypes);
	}
}
