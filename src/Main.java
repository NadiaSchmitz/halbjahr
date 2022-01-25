
public class Main {

	public static void main(String[] args) {
		
		int i, j;
		String gute = "I";
		int[][] halbjahr_1 = {{12, 8, 0, 20}, 
							  {7, 5, 20, 10}, 
							  {14, 4, 6, 15}};
		
		int[][] halbjahr_2 = {{13, 12, 5, 10},
							  {13, 7, 8, 20},
							  {12, 8, 7, 15}};
		
		int[][] jahr = new int[3][4];
		
		System.out.println("1. Halbjahr");
		System.out.println();
		System.out.println( "\t" + "A " + "\t" + "B " + "\t" + "C " + "\t" + "D");
		System.out.println("-------------------------------------");
		
		for (i = 0; i < halbjahr_1.length; i++) {
			System.out.print(gute.repeat(i + 1));
			for (j = 0; j < halbjahr_1[i].length; j++) {
				
				System.out.print("\t" + halbjahr_1[i][j]);
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("2. Halbjahr");
		System.out.println();
		System.out.println( "\t" + "A " + "\t" + "B " + "\t" + "C " + "\t" + "D");
		System.out.println("-------------------------------------");
		
		for (i = 0; i < halbjahr_2.length; i++) {
			System.out.print(gute.repeat(i + 1));
			for (j = 0; j < halbjahr_2[i].length; j++) {
				
				System.out.print("\t" + halbjahr_2[i][j]);
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Jahr");
		System.out.println();
		System.out.println( "\t" + "A " + "\t" + "B " + "\t" + "C " + "\t" + "D");
		System.out.println("-------------------------------------");
		
		for (i = 0; i < jahr.length; i++) {
			System.out.print(gute.repeat(i + 1));
			for (j = 0; j < jahr[i].length; j++) {
				
				jahr[i][j] = halbjahr_1[i][j] + halbjahr_2[i][j];
				System.out.print("\t" + jahr[i][j]);
				
			}
			System.out.println();
			
		}
		
	}

}
