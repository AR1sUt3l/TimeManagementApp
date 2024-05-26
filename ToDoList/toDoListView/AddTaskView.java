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

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import toDoList.DueDate;
import toDoList.ListOfTypes;
import toDoList.NameNotFoundException;
import toDoList.Task;

public class AddTaskView extends JFrame
{
	private static final int WINDOW_HEIGHT = 500;
	private static final int WINDOW_WIDTH = 400;
	
	private JPanel mainPanel = new JPanel();
	private JPanel titlePanel = new JPanel();
	private JPanel namePanel = new JPanel();
	private JPanel typePanel = new JPanel();
	private JPanel deadlinePanel = new JPanel();
	private JPanel buttonsPanel = new JPanel();
	
	private JLabel title;
	private JLabel nameLabel;
	private JTextField nameOfTask;
	private JLabel typeLabel;
	private JComboBox<String> typeComboBox;
	private JLabel deadlineLabel;
	private JTextField deadlineDate;
	private JButton enterButton;
	private JButton cancelButton;
	private JLabel instructions;
	private JCheckBox noDeadline;
	
	private ToDoListView mainView;
	
	private ListOfTypes typeList = new ListOfTypes();
	private String[] list = typeList.getList();
	private Task task;
	
	public AddTaskView(ToDoListView mainView)
	{
		this.mainView = mainView;
		
		initialFrame();
		initialUI();
		
		pack();
		setVisible(true);
	}
	
	/**
	 * Initializes the frame
	 */
	public void initialFrame()
	{
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}
	
	/**
	 * Initializes the UI
	 */
	public void initialUI()
	{
		mainPanel.setLayout(new GridLayout(4, 1));
		addTitle();
		addName();
		addDeadline();
		addButtons();
		add(mainPanel);
	}

	/**
	 * Add title of this window in a panel
	 */
	private void addTitle()
	{
		title = new JLabel("New Task");
		titlePanel.add(title);
		mainPanel.add(titlePanel);
	}
	
	/**
	 * Section to add name of task
	 */
	private void addName()
	{
		nameLabel = new JLabel("Name: ");
		nameOfTask = new JTextField(10);
		namePanel.add(nameLabel);
		namePanel.add(nameOfTask);
		mainPanel.add(namePanel);
	}
	
	/**
	 * Adds 3rd 
	 */
	private void addDeadline()
	{
		deadlineLabel = new JLabel("Deadline: ");
		deadlineDate = new JTextField(10);
		instructions = new JLabel("Please enter a valid date in MM/dd/yyyy format");
		deadlinePanel.add(deadlineLabel);
		deadlinePanel.add(deadlineDate);
		deadlinePanel.add(instructions);
		mainPanel.add(deadlinePanel);
	}
	
	/**
	 * Adds the enter and cancel buttons
	 */
	private void addButtons()
	{
		enterButton = new JButton("ENTER");
		AddTask enterButtonListener = new AddTask();
		enterButton.addActionListener(enterButtonListener);
		cancelButton = new JButton("CANCEL");
		closeWindow cancelButtonListener = new closeWindow();
		cancelButton.addActionListener(cancelButtonListener);
		buttonsPanel.add(enterButton);
		buttonsPanel.add(cancelButton);
		mainPanel.add(buttonsPanel);
	}
	
	/**
	 * Event Listener for the enter button
	 */
	private class AddTask implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String name = nameOfTask.getText();
			DueDate deadline = new DueDate(deadlineDate.getText());
			Task newTask;
			newTask = new Task(name, deadline);
			mainView.getCenterPanel().add(new TaskPanel(newTask, mainView));
			mainView.getCenterPanel().revalidate();
			dispose();
		}
	}
	
	/**
	 * Event listener of the cancel button
	 */
	private class closeWindow implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
	
}
