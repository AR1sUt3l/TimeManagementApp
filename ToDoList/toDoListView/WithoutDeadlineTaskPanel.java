package toDoListView;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

import toDoList.Task;

public class WithoutDeadlineTaskPanel extends TaskPanel
{

	public WithoutDeadlineTaskPanel(Task task, ToDoListView mainView)
	{
		super(task, mainView);
	}

	@Override
	public void setLabels()
	{
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		nameLabel = new JLabel(task.getName());
		textPanel.add(nameLabel);
	}

}
