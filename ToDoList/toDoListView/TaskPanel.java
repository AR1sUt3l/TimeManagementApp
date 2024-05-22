package toDoListView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import toDoList.Task;

public abstract class TaskPanel extends JPanel
{
	private int panelWidth = ToDoListView.WINDOW_WIDTH - 100;
	private int panelHeight = 50;
 	protected JPanel textPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JPanel checkBoxPanel = new JPanel();
	private JPanel emptyPanel = new JPanel();
	private JCheckBox taskCheckBox;
	protected JLabel nameLabel;
	protected JLabel deadline;
	
	private Task _task = new Task("");
	
	public TaskPanel()
	{		
		repaint();
		setPreferredSize(new Dimension(panelWidth, panelHeight));
		setLayout(new GridLayout(1, 2));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLabels();
		setRightPanel();
		add(textPanel);
		add(rightPanel);
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon backgroundImage = new ImageIcon("images/ToDoListView/TaskPanel v1.png");
		g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
	}
	
	abstract public void setLabels();
	
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
	
}
