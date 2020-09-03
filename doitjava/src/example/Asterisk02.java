package example;

public class Asterisk02 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i - 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
