package id.ac.ts.adam224.BrickBreaker;

import javax.swing.JFrame;

import java.awt.EventQueue;

public class Breakout extends JFrame {

   public Breakout() {
        
        initUI();
    }
    
    private void initUI() {

        add(new Board());
        setTitle("Breakout");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {
        
       EventQueue.invokeLater(() -> {

            var game = new Breakout();
            game.setVisible(true);
        });
    }
}

/*MainMenu mainMenu = new MainMenu();
		mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainMenu.setSize(275, 110);
		mainMenu.setVisible(true);*/