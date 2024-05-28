package toDoListView;

import java.awt.GridLayout;

import javax.swing.JLabel;

import toDoList.Task;

public class WithDeadlineTaskPanel extends TaskPanel
{

	public WithDeadlineTaskPanel(Task task, ToDoListView mainView)
	{
		super(task, mainView);
	}

	@Override
	public void setLabels()
	{
		textPanel.setLayout(new GridLayout(2, 1));
		nameLabel = new JLabel(task.getName());
		deadline = new JLabel(task.getDeadline().toString());
		textPanel.add(nameLabel);
		textPanel.add(deadline);
	}
	

}
