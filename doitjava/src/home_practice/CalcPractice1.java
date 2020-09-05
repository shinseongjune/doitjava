package home_practice;

import java.util.Scanner;

public class CalcPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String calc = "";
		
		System.out.print("첫 번째 숫자를 입력하세요 >");
		num1=sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 >");
		num2 = sc.nextInt();
		System.out.println("무슨 연산을 하시겠습니까?");
		calc = sc.next();
		
		if(calc.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		} else if(calc.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		} else if(calc.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		} else if(calc.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2) + (num1/num2!=0 ? " 나머지 " + (num1%num2) : ""));
		}
		sc.close();
	}

}
