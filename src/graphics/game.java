package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class game extends graphics{
	public game(JFrame menu) {
		game game = this;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Swing Balls is on game");
		this.setLayout(new BorderLayout());
		this.setSize(1200, 800);
		setWindowCenter(this);
		
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == e.VK_ESCAPE) {
					setVisible(false);
					menu.setVisible(true);
				}
			}
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
	}
	private void displayMap() {
		
	}
}
