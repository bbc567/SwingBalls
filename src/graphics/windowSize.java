package graphics;

import java.awt.*;

public enum windowSize {
	//RESOLUTION(),
	MENU(400, 500),
	GAME(1200, 800);
	
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
