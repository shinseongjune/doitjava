package example;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ���� ����ұ��?: ");
//		int line = sc.nextInt();
//		for (int i = 0; i < line; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}
//		sc.close();
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?: ");
		int line = sc.nextInt();
		for (int i = line-1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j%2!=0 ? "\\" : "$");
			}
			System.out.println();
		}
		sc.close();
	}

}
