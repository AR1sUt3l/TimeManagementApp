package toDoListView;

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

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import toDoList.ListOfTasks;

public class ToDoListView extends JFrame
{
	public static final int WINDOW_WIDTH = 500;
	public static final int WINDOW_HEIGHT = 750;
	private static final String TITLE = "To Do List";
	private static final String DEADLINE = "With Deadline";
	
	private static JPanel mainPanel = new JPanel();
	private static JPanel buttonPanel = new JPanel();
	private static JPanel centerPanel = new JPanel();
	private WithDeadlinePanel deadlinePanel = new WithDeadlinePanel(this);
	private WithoutDeadlinePanel noDeadlinePanel = new WithoutDeadlinePanel(this);

	private JButton taskButton;
	private JButton completedButton;
		
	public ToDoListView()
	{
		initialFrame();
		initialUI();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setVisible(true);
	}
	
	/**
	 * Initializes the frame by setting the title and size
	 */
	public void initialFrame()
	{
		setTitle(TITLE);
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}
	
	/**
	 * Initializes the UI
	 */
	public void initialUI()
	{
		mainPanel.setLayout(new BorderLayout());
		addCenterSection();
		addBottomSection();
		add(mainPanel);
	}
	
	/**
	 * Add the center panel that will hold the task panels
	 */
	public void addCenterSection()
	{
		centerPanel.setLayout(new GridLayout(2,1));
		centerPanel.add(deadlinePanel);
		centerPanel.add(noDeadlinePanel);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
	}
	
	/**
	 * Adds the buttons that adds a new task and shows the completed tasks
	 */
	public void addBottomSection()
	{
		completedButton = new JButton("Completed Tasks");
		CompletedTaskListener completedListener = new CompletedTaskListener();
		completedButton.addActionListener(completedListener);
		taskButton = new JButton("Add Task");
		TaskButtonListener listener = new TaskButtonListener();
		taskButton.addActionListener(listener);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(taskButton);
		buttonPanel.add(completedButton);
		buttonPanel.setOpaque(false);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
	}
	
	/**
	 * 
	 * @return center panel that contains the tasks
	 */
	public JPanel getCenterPanel()
	{
		return centerPanel;
	}
	
	public static void main(String[] args)
	{
		new ToDoListView();
	}
	
	/**
	 * Event listener for the button that adds tasks
	 */
	private class TaskButtonListener implements ActionListener
	{		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			new AddTaskView(ToDoListView.this, deadlinePanel, noDeadlinePanel);
		}
	}
	
	/**
	 * Print out the text file that contains the printed class
	 */
	private class CompletedTaskListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			File file = new File("textFiles/CompletedTasks.txt");
			Scanner readFile = null;
			try
			{
				readFile = new Scanner(file);
				while (readFile.hasNext())
				{
					System.out.print(readFile.nextLine());
				}
			}
			catch (IOException exception)
			{
				exception.printStackTrace();
			}
			finally
			{
				readFile.close();
			}
		}
	}
	
	
}
