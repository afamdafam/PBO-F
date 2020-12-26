/*package id.ac.ts.adam224.BrickBreaker;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

public class MainMenu extends JFrame {
	private JButton playButton; 
	private JButton scoreButton;
	private JButton creditButton;
	
	public MainMenu() {
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		playButton = new JButton("Play"); 
		add(playButton); 
		
		scoreButton = new JButton("Score");
		add(scoreButton);
		
		creditButton = new JButton("Credits");
		add(creditButton);
		
		ButtonHandler handler = new ButtonHandler();
		playButton.addActionListener(handler);
		creditButton.addActionListener(handler);
		scoreButton.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			
			String opt = event.getActionCommand();
				if(opt.equals("Play")) {
					add(new Board());
			        setTitle("Breakout");

			        setDefaultCloseOperation(EXIT_ON_CLOSE);
			        setLocationRelativeTo(null);
			        setResizable(false);
			        pack();
				
				}
				
				if(opt.equals("Score")) {
					
				}
				
				if(opt.equals("Credits")) {
					
				}
		}
	}
	
	
}*/
