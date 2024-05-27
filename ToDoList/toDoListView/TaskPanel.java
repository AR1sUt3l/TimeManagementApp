package toDoListView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import toDoList.ListOfTasks;
import toDoList.Task;

/**
 * Lead Author(s):
 * @author Aleczandria Villagracia
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 05.24.2024.01
 * 
 * Responsibilities of class:
 * 
 */

public abstract class TaskPanel extends JPanel
{
	protected int panelWidth = ToDoListView.WINDOW_WIDTH - 50;
	protected int panelHeight = 50;
 	protected JPanel textPanel = new JPanel();
	protected JPanel rightPanel = new JPanel();
	private JPanel checkBoxPanel = new JPanel();
	private JCheckBox taskCheckBox;
	protected JLabel nameLabel;
	protected JLabel deadline;
	
	protected Task task;
	protected ToDoListView mainView;
			
	public TaskPanel(Task task, ToDoListView mainView)
	{
		this.task = task;
		this.mainView = mainView;
		setPreferredSize(new Dimension(panelWidth, panelHeight));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLayout(new GridLayout(1, 2));
		setLabels();
		setRightPanel();
		add(textPanel);
		add(rightPanel);
	}
	
	/**
	 * Adds the name and deadline of the task to the panel
	 */
	public abstract void setLabels();
	
	/**
	 * Adds the panel with the checkBox and aligns it to the right
	 */
	public void setRightPanel()
	{
		setCheckBox();
		rightPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		rightPanel.add(checkBoxPanel);
	}
	
	/**
	 * Adds a checkbox and its event listener
	 */
	public void setCheckBox()
	{
		taskCheckBox = new JCheckBox();
		CheckBoxListener listener = new CheckBoxListener();
		taskCheckBox.addActionListener(listener);
		checkBoxPanel.add(taskCheckBox);
	}
	
	/**
	 * Event listener for the checkbox
	 */
	private class CheckBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			task.setToCompleted();
			addToFile();
			mainView.getCenterPanel().remove(TaskPanel.this);
			mainView.getCenterPanel().revalidate();
		}
		
		/**
		 * Adds the completed task to the CompletedTasks.txt file
		 */
		public void addToFile()
		{
			File file = new File("textFiles/CompletedTasks.txt");
			Scanner readFile = null;
			PrintWriter writeFile = null;
			String fileContents = "";
			try
			{
				readFile = new Scanner(file);
				while (readFile.hasNext())
				{
					fileContents += readFile.nextLine() + "\n";
				}
				writeFile = new PrintWriter(file);
				writeFile.println(fileContents);
				writeFile.println(task.toString());
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				readFile.close();
				writeFile.close();
			}
			
		}
	}
}
