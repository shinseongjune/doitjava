package game;

import java.util.Scanner;

public class UserInput {
	int[] userInput = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	void input() {
		for(int i=0;i<3;i++) {
			System.out.print(i + 1 + "번째 숫자:");
			userInput[i] = sc.nextInt();
			if(userInput[i] < 1 || userInput[i] > 9) {
				System.out.println("적절하지 않은 숫자입니다!");
				i--;
				continue;
			}
			for(int j=0;j<i;j++) {
				if(userInput[i] == userInput[j]) {
					System.out.println("다른 숫자를 입력하세요!");
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
