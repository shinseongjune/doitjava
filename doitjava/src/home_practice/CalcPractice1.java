package home_practice;

import java.util.Scanner;

public class CalcPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String calc = "";
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� >");
		num1=sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� >");
		num2 = sc.nextInt();
		System.out.println("���� ������ �Ͻðڽ��ϱ�?");
		calc = sc.next();
		
		if(calc.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		} else if(calc.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		} else if(calc.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		} else if(calc.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2) + (num1/num2!=0 ? " ������ " + (num1%num2) : ""));
		}
		sc.close();
	}

}
