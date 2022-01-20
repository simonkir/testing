public class Test {
    public static void main(String[] args) {

		// dimensions of the set
		final int width = 30;
		final int height = 30;

		// stores the status of all cells in the simulation
		// 1 = alive cell
		// 0 = dead cell
		int[][] set = new int[width][height];
		
		int x = 18;
		int y = 24;
			

		set[x][y] = 1;


		if (set[x][y] == 1){
			System.out.println("Lebt");
		}
		
		
		
    }
}
