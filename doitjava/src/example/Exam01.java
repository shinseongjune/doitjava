package example;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하십시오.");
		System.out.print("> ");
		num1 = scan.nextInt();
		
		System.out.println("숫자를 입력하십시오.2");
		System.out.print("> ");
		num2 = scan.nextInt();
		
		if (num1 == num2) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		if (num1 == num2) System.out.println("Same");
		else System.out.println("Different");
		
		System.out.println(num1 == num2 ? "same" : "different");
		scan.close();
	}

}
