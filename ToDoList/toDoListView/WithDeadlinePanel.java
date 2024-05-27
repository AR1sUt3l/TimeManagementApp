package toDoListView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import toDoList.DueDate;
import toDoList.ListOfTasks;
import toDoList.Task;

public class WithDeadlinePanel extends JPanel
{
	private JLabel dueDate;
	
	private Task task;
	private ToDoListView mainView;
	
	public WithDeadlinePanel(ToDoListView mainView)
	{
		this.mainView = mainView;
		dueDate = new JLabel("With Deadline");
		add(dueDate);
		setBorder(BorderFactory.createLineBorder(Color.PINK));
		setBackground(Color.WHITE);
		setOpaque(false);
	}
	
	public void addTaskPanel(Task newTask)
	{
		add(new WithDeadlineTaskPanel(newTask, mainView));
	}

}
