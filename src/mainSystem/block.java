package mainSystem;

public enum block {
	EMPTY(-1),
	BASIC(1),
	JUMP(2);
	
	private int blockID;
	
	block(int blockID){
		this.blockID = blockID;
	}
	
	public int getBlockID() {
		return blockID;
	}
}
