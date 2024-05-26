package toDoListView;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import toDoList.Task;

public class WithoutDeadlinePanel extends JPanel
{
	private JLabel noDueDate;
	
	public WithoutDeadlinePanel()
	{
		noDueDate = new JLabel("No Deadlines");
		add(noDueDate);
		setBorder(BorderFactory.createLineBorder(Color.CYAN));
		setLayout(new FlowLayout());
		setOpaque(false);
	}
	
}