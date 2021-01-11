package files;

public class Level {
	
	public static int MAX_LEVEL = 8;
	
	public static int[][][] levels = new int[24][8][10];
	public static int[][][] userLevels = new int[8][8][10];
	public static boolean[] lockedLevels = new boolean[MAX_LEVEL+1];
	public static int[] scores = new int [MAX_LEVEL+1];

	public static int[][] getLevel(int level){
		if(level <= MAX_LEVEL) {
		fillLevels();
		return levels[level];
		}else {
			return Files.readLevel(level-25);
		}
	}
	public static void fillLevels() {
		levels[0] = level0;
		levels[1] = level1;
		levels[2] = level2;
		levels[3] = level3;
		levels[4] = level4;
		levels[5] = level5;
		levels[6] = level6;
		levels[7] = level7;

	}
	
	private static int[][] level0 =    {{1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
										{0, 2, 0, 0, 2, 0, 0, 2, 0, 0},
										{1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

	private static int[][] level1 =    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
	
	private static int[][] level2 =    {{1, 1, 4, 1, 1, 1, 1, 4, 1, 1},
										{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
										{1, 2, 1, 1, 3, 3, 1, 1, 2, 1},
										{1, 1, 2, 1, 1, 1, 1, 2, 1, 1},
										{1, 1, 1, 2, 2, 2, 2, 1, 1, 1},
										{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 1, 0, 0, 0, 0}};
	
	private static int[][] level3 =    {{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
	
	private static int[][] level4 =    {{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
	
	private static int[][] level5 =    {{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
	
	private static int[][] level6 =    {{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
	
	private static int[][] level7 =    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};


}
