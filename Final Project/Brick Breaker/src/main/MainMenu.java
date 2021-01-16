package main;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import handlers.MouseHandler;

public class MainMenu {

	private Rectangle[] bounds = {new Rectangle(128, 238, 256, 36),
								  new Rectangle(128, 295, 256, 36),
								  new Rectangle(128, 352, 256, 36)};
	private Image titleScreenForeground;

	
	public MainMenu() {
		titleScreenForeground = new ImageLoader(ImageLoader.titleForeground).getImage();


	}
	public void tick() {
		for(int i = 0; i < bounds.length; i++) {
			if(bounds[i].contains(Controller.mousePoint) && MouseHandler.MOUSEDOWN) {
				MouseHandler.MOUSEDOWN = false;
				if(i == 0) {
					Controller.switchStates(Controller.STATE.PICKLEVEL);
				}
				if(i == 1) {
					Controller.switchStates(Controller.STATE.HIGHSCORES);
				}
				if(i == 2) {
					Controller.switchStates(Controller.STATE.CREDITS);
				}
			}
		}
	}

	public void render(Graphics g) {

		g.setFont(Controller.bigFont);
		Graphics2D g2 = (Graphics2D)g;
	    GradientPaint blueToBlack = new GradientPaint(0, 0, Color.WHITE, 0, 600, Color.BLUE);
	    g2.setPaint(blueToBlack);
		g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
		g.setColor(Color.black);
		g.drawImage(titleScreenForeground, 0, 0, Frame.WIDTH, Frame.WIDTH, null);
	}
}
