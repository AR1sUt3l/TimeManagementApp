package toDoListView;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	private JComboBox<String> typeList;
	private JLabel deadlineLabel;
	private JTextField deadlineDate;
	private JButton enterButton;
	private JButton cancelButton;
	
	private String name;
	
	private String[] list = {"General", "English", "Math", "Science"};
	private String[] dates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
						   "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						   "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	private String[] months = {"January", "February", "March", "April", "May", "June",
							   "July", "August", "September", "October", "November", "December"};
	private String[] years = {"2024", "2025", "2026", "2027", "2028"};
	
	public AddTaskView()
	{
		initialFrame();
		initialUI();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public void initialFrame()
	{
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}
	
	public void initialUI()
	{
		mainPanel.setLayout(new GridLayout(5, 1));
		addTitle();
		addName();
		addType();
		addDeadline();
		addButtons();
		add(mainPanel);
	}

	private void addTitle()
	{
		title = new JLabel("New Task");
		titlePanel.add(title);
		mainPanel.add(titlePanel);
	}
	
	private void addName()
	{
		nameLabel = new JLabel("Name: ");
		nameOfTask = new JTextField(10);
		namePanel.add(nameLabel);
		namePanel.add(nameOfTask);
		mainPanel.add(namePanel);
	}
	
	private void addType()
	{
		typeLabel = new JLabel("Type: ");
		typeList = new JComboBox<String>(list);
		typePanel.add(typeLabel);
		typePanel.add(typeList);
		mainPanel.add(typePanel);
	}
	
	private void addDeadline()
	{
		deadlineLabel = new JLabel("Deadline: ");
		deadlineDate = new JTextField("Please enter in MM/DD/YYYY");
		deadlinePanel.add(deadlineLabel);
		deadlinePanel.add(deadlineDate);
		mainPanel.add(deadlinePanel);
	}
	
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
	
	public static void main(String[] args)
	{
		new AddTaskView();
	}
	
	private class AddTask implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			name = nameOfTask.getText();
			String typeInString = typeList.getSelectedItem().toString();
			System.out.println(typeInString);
//			Type type = new Type(typeInString);
//			Task newTask = new Task(name, type);
			if (deadlineDate.getText() == "")
			{
				new ToDoListView().addTaskToNoDueDate();
			}
			else
			{
				new ToDoListView().addTaskToDueDate();
			}
			dispose();
		}
	}
	private class closeWindow implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
	
}
