package example;

import java.util.Scanner;

public class Game04 {

	public static void main(String[] args) {
		//1���� �Է¹��� ���� n(�ִ� 1_000_000)������ �Ҽ��� ������ ����ϴ� ���α׷�.
		Scanner sc = new Scanner(System.in);
		int num = 0, cnt = 0;
		boolean sosu = true;
		
		System.out.println("�Ҽ� ���� ���α׷��Դϴ�.");
		while(num < 1 || num > 1_000_000) {
			System.out.print("1���� 1,000,000���� ���� �� �ϳ��� �Է��Ͻʽÿ� :");
			num = sc.nextInt();
		}
		
		sc.close();
	}

}
