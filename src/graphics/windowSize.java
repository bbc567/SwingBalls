package graphics;

import java.awt.*;
import map.MapSize;

public enum windowSize {
	MENU(400, 500),
	GAME(map.MapSize.getMapX(), map.MapSize.getMapY());
	
	private int sizeX;
	private int sizeY;
	
	windowSize(int sizeX, int sizeY){
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	public int getSizeX() {
		return sizeX;
	}
	public int getsizeY() {
		return sizeY;
	}
}
