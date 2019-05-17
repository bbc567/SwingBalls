package graphics;

public enum ImgButton {
	START_BUTTON
	("resource/img/button/start_normal.png", 
	"resource/img/button/start_rollover.png", 
	"resource/img/button/start_pressed.png");
	
	private String normalImg = null;
	private String rolloverImg = null;
	private String pressedImg = null;
	
	ImgButton(String normalImg, String rolloverImg, String pressedImg){
		this.normalImg = normalImg;
		this.rolloverImg = rolloverImg;
		this.pressedImg = pressedImg;
	}
	public String getNormalLink() {
		return normalImg;
	}
	public String getRolloverLink() {
		return rolloverImg;
	}
	public String getPressedLink() {
		return pressedImg;
	}
}
