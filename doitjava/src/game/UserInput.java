package game;

import java.util.Scanner;

public class UserInput {
	int[] userInput = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	void input() {
		for(int i=0;i<3;i++) {
			System.out.print(i + 1 + "��° ����:");
			userInput[i] = sc.nextInt();
			if(userInput[i] < 1 || userInput[i] > 9) {
				System.out.println("�������� ���� �����Դϴ�!");
				i--;
				continue;
			}
			for(int j=0;j<i;j++) {
				if(userInput[i] == userInput[j]) {
					System.out.println("�ٸ� ���ڸ� �Է��ϼ���!");
					i--;
					break;
				}
			}
		}
	}
	
	void cl() {
		sc.close();
	}
}
