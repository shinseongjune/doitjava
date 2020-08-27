package example;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요?: ");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		for (int i = line; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				System.out.print("$");
			}
			System.out.println();
		}
		sc.close();
	}

}
