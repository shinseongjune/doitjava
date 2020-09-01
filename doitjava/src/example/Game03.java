package example;

import java.util.Scanner;

public class Game03 {

	public static void main(String[] args) {
		// ���� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// switch case ������ ����ؾ� �մϴ�.

		Scanner sc = new Scanner(System.in);
		int month = 0, day = 0;
		while (month < 1 || month > 12) {
			System.out.print("�� ������ ������ ���ڸ� �˰� �����Ű���? :");
			month = sc.nextInt();
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
		}
		System.out.println(month + "���� ������ ���� " + day + "���Դϴ�.");
		sc.close();
	}

}
