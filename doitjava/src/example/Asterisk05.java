package example;

public class Asterisk05 {

	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (j < i - 1) {
					System.out.print("@");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
