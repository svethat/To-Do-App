import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class GUI extends JFrame{
	
	public static JLabel background = new JLabel(new ImageIcon("images/Background.jpeg"));
	public static JFrame frame = new JFrame();
	public static JLabel title = new JLabel("To Do List");
	public static JLabel tasksLabel = new JLabel("Tasks");

	public static JTextField text = new JTextField("What's your plan for today?");
	
	public static JTextField tasks = new JTextField();
	
	public static JButton checkMark = new JButton(new ImageIcon("images/Check Mark Button.png"));
	public static JButton uncheckMark = new JButton(new ImageIcon("images/Remove Button.png"));
	public static JButton addTasks = new JButton(new ImageIcon("images/Add Button.png"));

	public static int tasksCompletedCounter;
	public static JLabel tasksCompletedCounterLabel = new JLabel("Tasks completed: " + tasksCompletedCounter);
	public static int tasksIncompletedCounter;
	public static JLabel tasksIncompletedCounterLabel = new JLabel("Tasks incompleted: " + tasksIncompletedCounter);
	
	public static JButton editButton = new JButton(new ImageIcon("images/Edit Button.png"));
	public static JButton settingsGear = new JButton(new ImageIcon("images/Settings Gear.png"));
	
	public static JLabel wallpaperImage1 = new JLabel(new ImageIcon("images/Wallpaper #1.png"));
	
	public GUI(){
		
		Functions functions = new Functions();
		frame.setTitle("To Do App");
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		background.setLayout(null);
		frame.add(background);
		frame.setLocationRelativeTo(null);
		
		//The title
		title.setFont(new Font("verdana", Font.BOLD, 30));
		title.setBounds(200, 0, 200, 100);
		background.add(title);
		
		//The add tasks button
		addTasks.setBounds(410, 95, 40, 40);
		addTasks.setOpaque(false);
		addTasks.setContentAreaFilled(false);
		addTasks.setBorderPainted(false);
		background.add(addTasks);
		
		text.setFont(new Font("verdana", Font.BOLD, 10));
		text.setBounds(200, 100, 200, 30);
		//pick an attractive color
		text.setBackground(new Color(231, 84, 128));
		text.setForeground(new Color(48, 25, 52));
		background.add(text);
		
		tasksLabel.setFont(new Font("verdana", Font.BOLD, 30));
		tasksLabel.setBounds(240, 120, 200, 100);
		background.add(tasksLabel);
		
		tasks.setText("Task #1");
		tasks.setFont(new Font("verdana", Font.BOLD, 10));
		tasks.setBounds(200, 200, 200, 30);
		tasks.setForeground(new Color(48, 25, 52));
		//pick an attractive color
		tasks.setBackground(new Color(231, 84, 128));
		
		checkMark.setBounds(160, 200, 35, 35);
		checkMark.setOpaque(false);
		checkMark.setContentAreaFilled(false);
		checkMark.setBorderPainted(false);
		
		uncheckMark.setBounds(405, 200, 35, 35);
		uncheckMark.setOpaque(false);
		uncheckMark.setContentAreaFilled(false);
		uncheckMark.setBorderPainted(false);

		tasksCompletedCounterLabel.setBounds(450, 500, 200, 100);
		tasksCompletedCounterLabel.setFont(new Font("Ink free", Font.BOLD, 15));
		tasksCompletedCounterLabel.setVisible(true);
		background.add(tasksCompletedCounterLabel);
		
		tasksIncompletedCounterLabel.setBounds(5, 500, 200, 100);
		tasksIncompletedCounterLabel.setFont(new Font("Ink free", Font.BOLD, 15));
		background.add(tasksIncompletedCounterLabel);	
		
		editButton.setBounds(450, 200, 35, 35);
		editButton.setOpaque(false);
		editButton.setContentAreaFilled(false);
		editButton.setBorderPainted(false);
		
		settingsGear.setBounds(10, 10, 35, 35);
		settingsGear.setOpaque(false);
		settingsGear.setContentAreaFilled(false);
		settingsGear.setBorderPainted(false);
		settingsGear.setVisible(true);
		background.add(settingsGear);
	}
}