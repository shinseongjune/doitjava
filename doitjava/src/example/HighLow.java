package example;

import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1, com, user;

		com = (int) (Math.random() * 100) + 1;
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("1 ~ 100 �߿� �����ϰ� ������ ���ڸ� ���� �ּ���.");

		while (true) {
			System.out.print("���ڸ� �Է��Ͻʽÿ�:");
			user = sc.nextInt();

			if (com == user) {
				System.out.println("�ڡ�You win!�١�");
				System.out.println(cnt + "ȸ���� �������ϴ�!");
				break;
			} else if (com > user) {
				System.out.println("High! High!");
			} else {
				System.out.println("Low...");
			}

			cnt++;

		}
		sc.close();
	}

}
