package chapter04;

import java.util.Scanner;

/*
 * ���ڸ� �Է� �޾Ƽ� �Է¹��� ���ڰ� Ȧ������ ¦������
 * ����ϼ���.
 */
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		System.out.print("> ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " ¦���Դϴ�.");
		} else {
			System.out.println(num + " Ȧ���Դϴ�.");
		}
		
		sc.close();
	}
}
