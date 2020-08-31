package example;

import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1, com, user;

		com = (int)(Math.random() * 100) + 1;

		while (true) {
			System.out.print("숫자를 입력하십시오:");
			user=sc.nextInt();	
			
			if (com == user) {
				System.out.println("★☆You win!☆★");
				System.out.println(cnt + "회만에 맞혔습니다!");
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
