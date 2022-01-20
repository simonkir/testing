public class Test {
    public static void main(String[] args) {

		// dimensions of the set
		final int width = 30;
		final int height = 30;

		// stores the status of all cells in the simulation
		// 1 = alive cell
		// 0 = dead cell
		int[][] set = new int[width][height];

		set[1][1] = 1; 


		for (int i=0; i<width; i++){
			for (int j=0; j<width; j++){
				Math.random();
				
				if (Math.random() < 0.5){
					set[i][j] = 1;
				}
				else {
					set[i][j] = 0;
				}
			}
		}
    }
}
