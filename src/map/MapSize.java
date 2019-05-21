package map;

import java.awt.Image;
import javax.swing.*;

public class MapSize {
	private static final int blockX = 30;
	private static final int blockY = 20;

	static Image block = new ImageIcon("resource/img/block.png").getImage();
	
	public static int getMapX() {
		return blockX * block.getWidth(null);
	}
	public static int getMapY() {
		return blockY * block.getHeight(null);
	}
	public static int getBlockX() {
		return blockX;
	}
	public static int getBlockY() {
		return blockY;
	}	
}
