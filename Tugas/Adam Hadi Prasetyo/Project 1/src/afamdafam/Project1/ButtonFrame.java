package afamdafam.Project1;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
	private JButton plainJButton; // button with just text
	private JButton fancyJButton; // button with icons
	
	public ButtonFrame() {
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("Circle"); // button with text
		add(plainJButton); // add plainJButton to JFrame
		
		fancyJButton = new JButton("Rectangle");
		add(fancyJButton); // add fancyJButton to JFrame
		
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			
			String opt = event.getActionCommand();
				if(opt.equals("Circle")) {
					String firstNumber =
							 JOptionPane.showInputDialog("Enter Radius");

					int number1 = Integer.parseInt(firstNumber);

					
					Circle c1 = new Circle(number1);
					
					JOptionPane.showMessageDialog(null, "The area is " + c1.getArea() + "\nThe circumference is " + c1.getCircumference(),
							 "", JOptionPane.PLAIN_MESSAGE); 
				
				}
				
				else if (opt.equals("Rectangle")) {
					String firstNumber =
							 JOptionPane.showInputDialog("Enter height");
					String secondNumber =
							 JOptionPane.showInputDialog("Enter width");
					
					int number1 = Integer.parseInt(firstNumber);
					int number2 = Integer.parseInt(secondNumber);
					Rectangle r1 = new Rectangle(number1,number2);
					
					JOptionPane.showMessageDialog(null, "The area is " + r1.getArea() + "\nThe circumference is " + r1.getCircumference(),
							 "", JOptionPane.PLAIN_MESSAGE);
				}
			
		}
	 }
}
