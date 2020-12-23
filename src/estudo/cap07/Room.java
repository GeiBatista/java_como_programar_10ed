package estudo.cap07;

public class Room {

	public static void main(String[] args) {

		int[][] rooms = { { 101, 103, 104, 107, 108 },
				          { 201, 202, 208, 209, 210 },
				          { 300, 302, 305, 307, 310}};

		System.out.printf("Busy Rooms%n%n");
		System.out.print("          ");	
		
		for(int apto = 0; apto < rooms[0].length; apto++ )
			System.out.printf("Aptº %1d  ",apto + 1);
		
		System.out.println();
		
		for(int andar = 0; andar < rooms.length; andar++) {
			
			System.out.printf("Andar %2d", andar + 1);
			
			
			for(int test : rooms[andar])
				System.out.printf("%8d", test);
			System.out.println();
		}
		
	}

}
