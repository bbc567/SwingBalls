package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class graphics extends JFrame{
	protected static void makeListener(JButton btn, JFrame toClose, JFrame toOpen) {
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				toClose.setVisible(false);
				toOpen.setVisible(true);
			}
		});
	}
	protected static void makeImgButton(JButton btn, ImgButton img) {
		ImageIcon iconNormal = new ImageIcon(img.getNormalLink());
		ImageIcon iconRollover = new ImageIcon(img.getRolloverLink());
		ImageIcon iconPressed = new ImageIcon(img.getPressedLink());
		
		btn.setIcon(iconNormal);
		btn.setPressedIcon(iconPressed);
		btn.setRolloverIcon(iconRollover);
		btn.setSize(iconNormal.getIconHeight(), iconNormal.getIconWidth());
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false);
	}
	protected static void setWindowCenter(JFrame frame) {
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();

		frame.setLocation((int) (res.getWidth() - frame.getWidth()) / 2, (int) (res.getHeight() - frame.getHeight()) / 2);
	}
}
