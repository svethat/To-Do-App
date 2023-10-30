import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Settings implements ActionListener{
	
	public static JFrame frame = new JFrame();
	
	public static JButton backButton = new JButton(new ImageIcon("images/Back Arrow.png"));
	public static JLabel samplePicture1 = new JLabel(new ImageIcon("images/Wallpaper #1 sample.jpg"));
	public static JLabel wallpaperTitle = new JLabel();
	public static JButton wallpaperButton1 = new JButton();
	
	Settings(){
		
		frame.setTitle("Settings");
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(wallpaperButton1);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(255,163,69));
		wallpaperButton1.setVisible(true);
		GUI.wallpaperImage1.setLayout(null);
		//this.add(GUI.wallpaperImage1);
		
		backButton.setBounds(10,490,64,64);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.setVisible(true);
		backButton.addActionListener(this);
		frame.add(backButton);
		
		wallpaperTitle.setText("Wallpapers");
		wallpaperTitle.setBounds(200, 10, 300, 100);
		wallpaperTitle.setFont(new Font("ink free", Font.BOLD, 40));
		wallpaperTitle.setVisible(true);
		frame.add(wallpaperTitle);
		
		wallpaperButton1.setText("Wallpaper #1");
		wallpaperButton1.setBounds(200, 150, 200, 20);
		wallpaperButton1.setFont(new Font("ink free", Font.BOLD, 20));
		wallpaperButton1.setOpaque(false);
		wallpaperButton1.setContentAreaFilled(false);
		wallpaperButton1.setBorderPainted(false);
		wallpaperButton1.addActionListener(this);
		
		samplePicture1.setBounds(400, 100, 117, 94);
		frame.setVisible(true);
		frame.add(samplePicture1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == backButton) {
			GUI gui = new GUI();
			frame.dispose();
		}
	}
}