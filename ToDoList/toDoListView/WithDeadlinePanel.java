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
	private String name;
	private DueDate deadline;
	
	public WithDeadlinePanel()
	{
		dueDate = new JLabel("With Deadline");
		add(dueDate);
		setBorder(BorderFactory.createLineBorder(Color.PINK));
		setBackground(Color.WHITE);
		setOpaque(false);
	}

}
