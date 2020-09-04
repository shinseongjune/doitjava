package home_practice;

public class TwoDimensionAlphabet {

	public static void main(String[] args) {
		char[][] arr = new char[13][2];
		char alphabet = 'a';
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j]= alphabet;
				alphabet++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
