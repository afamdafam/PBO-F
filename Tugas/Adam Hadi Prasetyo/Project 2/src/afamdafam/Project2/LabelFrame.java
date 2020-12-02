package afamdafam.Project2;
import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
	private final JLabel label3;
	
	public LabelFrame() {
		super("testinng JLabel");
		setLayout(new FlowLayout());
		
		Icon bug = new ImageIcon(getClass().getResource("foto.jpg"));

		label3 = new JLabel();
		label3.setText("NRP : 05111940000224 "+" +| " + "Nama : Adam Hadi Prasetyo");
		label3.setIcon(bug); // add icon to JLabel
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3"); 
		add(label3);
	}
}
