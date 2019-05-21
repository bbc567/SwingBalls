package map;

public class map {
	static int map[][] = new int[MapSize.getBlockY()][MapSize.getBlockY()];

	public map() {
		for (int i = 0; i < map.length; i++) {
			int[] temp = map[i];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = 0;
			}
		}
	}
	
	public void changeBlock(int i, int j, block block) {
		map[i][j] = block.getBlockID();
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < map.length; i++) {
			int[] temp = map[i];
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j] + " ");
			}
			System.out.println();
		}
	}
}
