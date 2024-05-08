package toDoList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskPanel extends JPanel
{
	private JPanel textPanel = new JPanel();
	private JPanel checkBoxPanel = new JPanel();
	private JCheckBox taskCheckBox;
	private JLabel name;
	private JLabel deadline;
	
	public TaskPanel()
	{
		setPreferredSize(new Dimension(200, 50));
		setLayout(new GridLayout(1, 2));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLabels();
		setCheckBox();
		add(textPanel);
		add(checkBoxPanel);
	}
	
	public void setLabels()
	{
		textPanel.setLayout(new GridLayout(2, 1));
		name = new JLabel("Name of Task");
		deadline = new JLabel("Deadline");
		textPanel.add(name);
		textPanel.add(deadline);
	}
	
	public void setCheckBox()
	{
		taskCheckBox = new JCheckBox();
		checkBoxPanel.add(taskCheckBox);
		checkBoxPanel.setAlignmentX(RIGHT_ALIGNMENT);
//		checkBoxPanel.setAlignmentY(CENTER_ALIGNMENT);
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.add(new TaskPanel());
		frame.setVisible(true);
	}
}
