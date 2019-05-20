package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class menu extends graphics{
	
	public menu() {		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Swing Balls");
		this.setLayout(new FlowLayout());
		this.setSize(400, 500);
		setWindowCenter(this);
		
		JFrame game = new game(this);
		JButton btnStart = new JButton();
		
		makeImgButton(btnStart, ImgButton.START_BUTTON);
		makeListener(btnStart, this, game);
		
		this.add(btnStart);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new menu();
	}
}
