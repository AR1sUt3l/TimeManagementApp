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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
	private JPanel deadlineCheckBoxPanel = new JPanel();
	private JPanel withDueDatePanel = new JPanel();
	
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
	private JButton lastButtonPressed;
	private ButtonGroup deadlineButtonGroup;
	private JRadioButton withDeadlineRadioButton;
	private JRadioButton withoutDeadlineRadioButton;

	private ToDoListView mainView;
	private WithDeadlinePanel withDeadlinePanel;
	private WithoutDeadlinePanel withoutDeadlinePanel;
	
	private DueDate deadline;
	
	private ListOfTypes typeList = new ListOfTypes();
	private String[] list = typeList.getList();
		
	public AddTaskView(ToDoListView mainView, WithDeadlinePanel withDeadlinePanel, WithoutDeadlinePanel withoutDeadlinePanel)
	{
		this.mainView = mainView;
		this.withDeadlinePanel = withDeadlinePanel;
		this.withoutDeadlinePanel = withoutDeadlinePanel;
		
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
		addDeadlineChoice();
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
	private void addDeadlineChoice()
	{
		deadlinePanel.setLayout(new GridLayout(2,1));
		deadlineButtonGroup = new ButtonGroup();
		withDeadlineRadioButton = new JRadioButton("Have a Deadline");
		HaveDeadlineListener listener = new HaveDeadlineListener();
		withDeadlineRadioButton.addActionListener(listener);
		withoutDeadlineRadioButton = new JRadioButton("Don't have a Deadline");
		NoDeadlineListener listener2 = new NoDeadlineListener();
		withoutDeadlineRadioButton.addActionListener(listener2);
		deadlineButtonGroup.add(withoutDeadlineRadioButton);
		deadlineButtonGroup.add(withDeadlineRadioButton);
		deadlineCheckBoxPanel.add(withDeadlineRadioButton);
		deadlineCheckBoxPanel.add(withoutDeadlineRadioButton);
		deadlinePanel.add(deadlineCheckBoxPanel);
		mainPanel.add(deadlinePanel);
	}
	
	public void addDeadline()
	{
		deadlineLabel = new JLabel("Deadline: ");
		deadlineDate = new JTextField(10);
		instructions = new JLabel("Please enter a valid date in MM/dd/yyyy format");
		withDueDatePanel.add(deadlineLabel);
		withDueDatePanel.add(deadlineDate);
		withDueDatePanel.add(instructions);
		withDueDatePanel.setVisible(false);
		deadlinePanel.add(withDueDatePanel);
	}
	
	/**
	 * Adds the enter and cancel buttons
	 */
	private void addButtons()
	{
		enterButton = new JButton("ENTER");
		EnterButtonListener enterButtonListener = new EnterButtonListener();
		enterButton.addActionListener(enterButtonListener);
		cancelButton = new JButton("CANCEL");
		CancelButtonListener cancelButtonListener = new CancelButtonListener();
		cancelButton.addActionListener(cancelButtonListener);
		buttonsPanel.add(enterButton);
		buttonsPanel.add(cancelButton);
		mainPanel.add(buttonsPanel);
	}
	
	private class HaveDeadlineListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			withDueDatePanel.setVisible(true);
//			revalidate();
		}
	}
	
	private class NoDeadlineListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			withDueDatePanel.setVisible(false);
//			revalidate();
		}
	}
	
	/**
	 * Event Listener for the enter button
	 */
	private class EnterButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String name = nameOfTask.getText();
			String properDate = "";
			Task newTask;
			if (withDeadlineRadioButton.isSelected())
			{
				deadline = new DueDate(deadlineDate.getText());
				while (deadline.toString() == "No Deadline")
				{
					properDate = JOptionPane.showInputDialog("Please enter a valid date in MM/dd/yyyy");
					deadline.setDate(properDate);
				}
				newTask = new Task(name, deadline);
				withDeadlinePanel.addTaskPanel(newTask);
			}
			else
			{
				deadline = new DueDate("");
				newTask = new Task(name, deadline);
				withoutDeadlinePanel.addTaskPanel(newTask);
			}
			mainView.getCenterPanel().revalidate();
			dispose();
		}
	}
	
	/**
	 * Event listener of the cancel button
	 */
	private class CancelButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
	
}
