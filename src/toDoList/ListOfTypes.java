package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfTypes implements SortByAlphabet
{
	private static ArrayList<String> _list = new ArrayList<>();
	
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
