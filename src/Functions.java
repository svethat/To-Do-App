import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

public class Functions implements ActionListener, KeyListener{
	
	static JPanel[] panel = new JPanel[9];

	
	Functions(){
		
		//buttons that preform different things
		GUI.addTasks.addActionListener(this);
		GUI.checkMark.addActionListener(this);
		GUI.uncheckMark.addActionListener(this);
		GUI.editButton.addActionListener(this);
		GUI.settingsGear.addActionListener(this);
	}
	
	//Adding a sound when user presses on the add tasks button 
	public void sound() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		
		File file  = new File("sound/Ding Sound.wav");
		AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file);
		Clip film = AudioSystem.getClip();
		film.open(audioStream1);
		film.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == GUI.addTasks && GUI.text.getText().equals("What's your plan for today?")) {
			GUI.tasks.setText(GUI.text.getText());
			GUI.tasks.setText("Tasks #1");
			GUI.text.setText("What's your plan for today?");
			GUI.background.add(GUI.tasks);
			GUI.tasks.setVisible(true);
			GUI.background.add(GUI.checkMark);
			GUI.checkMark.setVisible(true);
			GUI.background.add(GUI.uncheckMark);
			GUI.uncheckMark.setVisible(true);
			GUI.background.add(GUI.editButton);
			GUI.editButton.setVisible(true);
			GUI.tasksIncompletedCounter++;
			GUI.tasksCompletedCounter--;
			//System.out.println("Tasks completed: " + (tasksCompletedCounter = tasksCompletedCounter + 1));
			//System.out.println("Tasks uncompleted: " + tasksUncompletedCounter);
			GUI.tasksCompletedCounterLabel.setText("Tasks completed: " + (GUI.tasksCompletedCounter = GUI.tasksCompletedCounter + 1));
			GUI.tasksIncompletedCounterLabel.setText("Tasks incompleted: " + GUI.tasksIncompletedCounter);
			GUI.tasks.setEnabled(false);
			GUI.frame.repaint();
			
			for(int i = 0; i < 9; i++) {
		    	panel[i] = new JPanel();
		    	GUI.frame.add(panel[i]);
		    	
		    }
		}
		
		else if(e.getSource() == GUI.addTasks && !GUI.text.getText().equals("What's your plan for today?")) {
			
			GUI.tasks.setText(GUI.text.getText());
			GUI.text.setText("What's your plan for today?");
			GUI.background.add(GUI.tasks);
			GUI.tasks.setVisible(true);
			GUI.background.add(GUI.checkMark);
			GUI.checkMark.setVisible(true);
			GUI.background.add(GUI.uncheckMark);
			GUI.uncheckMark.setVisible(true);
			GUI.background.add(GUI.editButton);
			GUI.editButton.setVisible(true);
			GUI.tasksIncompletedCounter++;
			GUI.tasksCompletedCounter--;
			//System.out.println("Tasks completed: " + (tasksCompletedCounter = tasksCompletedCounter + 1));
			//System.out.println("Tasks uncompleted: " + tasksUncompletedCounter);
			GUI.tasksCompletedCounterLabel.setText("Tasks completed: " + (GUI.tasksCompletedCounter = GUI.tasksCompletedCounter + 1));
			GUI.tasksIncompletedCounterLabel.setText("Tasks incompleted: " + GUI.tasksIncompletedCounter);
			GUI.tasks.setEnabled(false);
			GUI.frame.repaint();
		}
		
		else if(e.getSource() == GUI.checkMark) {
			GUI.tasks.setVisible(false);
			//background.remove(tasks);
			GUI.uncheckMark.setVisible(false);
			//background.remove(uncheckMark);
			GUI.checkMark.setVisible(false);
			//background.remove(checkMark);
			GUI.editButton.setVisible(false);
			//background.remove(editButton);
			GUI.tasksIncompletedCounter--;
			GUI.tasksCompletedCounter++;
			//System.out.println("Tasks completed: " + GUI.tasksCompletedCounter);
			//System.out.println("Tasks uncompleted: " + GUI.tasksIncompletedCounter);
			GUI.tasksCompletedCounterLabel.setText("Tasks completed: " + GUI.tasksCompletedCounter);
			GUI.tasksIncompletedCounterLabel.setText("Tasks incompleted: " + GUI.tasksIncompletedCounter);
			try {
				sound();
			} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			GUI.frame.repaint();
		}
		
		else if(e.getSource() == GUI.uncheckMark) {
			GUI.tasks.setVisible(false);
			//background.remove(tasks);
			GUI.uncheckMark.setVisible(false);
			//background.remove(uncheckMark);
			GUI.checkMark.setVisible(false);
			//background.remove(checkMark);
			GUI.editButton.setVisible(false);
			GUI.tasksIncompletedCounter--;
			//System.out.println("Tasks completed: " + GUI.tasksCompletedCounter);
			//System.out.println("Tasks uncompleted: " + GUI.tasksIncompletedCounter);
			GUI.tasksCompletedCounterLabel.setText("Tasks completed: " + GUI.tasksCompletedCounter);
			GUI.tasksIncompletedCounterLabel.setText("Tasks incompleted: " + GUI.tasksIncompletedCounter);
			GUI.frame.repaint();
		}
		
		else if(e.getSource() == GUI.editButton) {
			GUI.tasks.setEnabled(true);
		}
		
		else if(e.getSource() == GUI.settingsGear) {
			Settings settings = new Settings();
			GUI.frame.dispose();
			GUI.frame.repaint();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("Working");
			GUI.tasks.setEnabled(false);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}