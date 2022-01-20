import java.lang.Math;

public class Test {
    public static void main(String[] args) {

		// dimensions of the set
		final int width = 30;
		final int height = 30;

		// stores the status of all cells in the simulation
		// 1 = alive cell
		// 0 = dead cell
		int[][] set = new int[width][height];

		// randomly assigns dead / alive state for each cell
		for (int i = 0; i < width; i++){
			for (int j = 0; j < height; j++) {

				// threshold below which cells become alive
				// used to better control how many cells are alive
				double threshold = 0.15;
				if (Math.random() < threshold) {
					set[i][j] = 1;
				} else {
					set[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (set[i][j] == 1) {
					System.out.print("#");
				} else {	
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
