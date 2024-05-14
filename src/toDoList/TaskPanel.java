package toDoList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskPanel extends JPanel
{
	private JPanel textPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JPanel checkBoxPanel = new JPanel();
	private JPanel emptyPanel = new JPanel();
	private JCheckBox taskCheckBox;
	private JLabel name;
	private JLabel deadline;
	
	public TaskPanel()
	{
		setPreferredSize(new Dimension(350, 50));
		setLayout(new GridLayout(1, 2));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLabels();
		setRightPanel();
		add(textPanel);
		add(rightPanel);
	}
	
	public void setLabels()
	{
		textPanel.setLayout(new GridLayout(2, 1));
		name = new JLabel("Name of Task");
		deadline = new JLabel("Deadline");
		textPanel.add(name);
		textPanel.add(deadline);
	}
	
	public void setRightPanel()
	{
		setCheckBox();
		rightPanel.add(checkBoxPanel);
	}
	
	public void setCheckBox()
	{
		checkBoxPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		taskCheckBox = new JCheckBox();
		checkBoxPanel.add(taskCheckBox);
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.add(new TaskPanel());
		frame.setVisible(true);
	}
}
