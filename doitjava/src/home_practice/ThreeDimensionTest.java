package home_practice;

public class ThreeDimensionTest {

	public static void main(String[] args) {
		char[][][] arr = new char[10][2][3];
		char alphabet = 'A';
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 3; k++) {
					arr[i][j][k] = alphabet;
					alphabet++;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				for(int k = 0 ; k < arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]);
				}
				System.out.println();
			}
		}
		
	}

}
