package main;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import files.Files;
import files.Level;
import handlers.MouseHandler;

public class Credits {

	
	Rectangle userLevel = new Rectangle(50, 390, 380, 25);

	

	public Credits() {
	
	}
	public void tick(){
		if(MouseHandler.MOUSEDOWN) {
			if(userLevel.contains(Controller.mousePoint)) {
				Controller.switchStates(Controller.STATE.MENU);
			}
			MouseHandler.MOUSEDOWN = false;
		}
	}
	public void render(Graphics g) {
		g.setFont(Controller.bigFont);
		Graphics2D g2 = (Graphics2D)g;
	    GradientPaint blueToBlack = new GradientPaint(0, 0, Color.CYAN, 0, 600, Color.BLUE);
	    g2.setPaint(blueToBlack);
		g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
		g.setColor(Color.black);
		g.drawString("Choose Level", Frame.WIDTH/2-g.getFontMetrics().stringWidth("Choose Level")/2, 80);
		
		g.drawRect(userLevel.x, userLevel.y, userLevel.width, userLevel.height);
		g.drawString("Back to Menu", Frame.WIDTH/2-g.getFontMetrics().stringWidth("Back to Menu")/2, 410);
		if(userLevel.contains(Controller.mousePoint)) {
			g.setColor(new Color(200, 200, 200, 100));
			g.fillRect(userLevel.x, userLevel.y, userLevel.width, userLevel.height);
			g.setColor(Color.black);
		}
	}
}
