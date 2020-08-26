package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하십시오.");
		System.out.print("> ");
		num1 = scan.nextInt();
		
		System.out.println(num1 % 2 == 0 ? "짝수" : "홀수");
		scan.close();
	}

}
