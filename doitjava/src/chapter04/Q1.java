package chapter04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		String oper;
		int res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		System.out.print(">");
		num1 = sc.nextInt();
		
		System.out.println("����2 �Է�");
		System.out.print(">");
		num2 = sc.nextInt();
		
		System.out.println("������ �Է�");
		System.out.print(">");
		oper = sc.next();
		
		System.out.println("��� ���");
		switch(oper) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2 + " ������ " + num1 % num2);
			break;
		default:
			System.out.println("�����Դϴ�.");
		}
	}

}
