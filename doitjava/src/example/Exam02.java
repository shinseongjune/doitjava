package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻʽÿ�.");
		System.out.print("> ");
		num1 = scan.nextInt();
		
		System.out.println(num1 % 2 == 0 ? "¦��" : "Ȧ��");
		scan.close();
	}

}
