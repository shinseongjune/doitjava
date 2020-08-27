package example;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요?: ");
		int line = sc.nextInt();
		
		for(int i = 0; i<line; i++) {
			if (i==0) {
				for(int j=0;j<line-1;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			} else if (i==line-1) {
				for(int j=0;j<line*2 -1;j++) {
					System.out.print("*");
				}
			} else {
			for(int j=0; j<line-i-1;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=0;j<i*2-1;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
