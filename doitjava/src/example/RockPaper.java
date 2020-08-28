package example;

import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = "";
		int score = 0;
		int life = 3;
//		do {
//			System.out.print("가위 바위 > ");
//			st = sc.next();
//		} while(!st.equals("가위") && !st.equals("바위") && !st.equals("보"));
//		
//		int opponent = (int)(Math.random() * 3) + 1; //1:가위 2:바위 3:보
//		
//		switch(opponent) {
//		case 1:
//			System.out.println(st.equals("바위") ? st + " 대 가위\n승리" : st.equals("가위") ? st + " 대 가위\n무승부" : st + " 대 가위\n패배");
//			break;
//		case 2:
//			System.out.println(st.equals("보") ? st + " 대 바위\n승리" : st.equals("바위") ? st + " 대 바위\n무승부" : st + " 대 바위\n패배");
//			break;
//		case 3:
//			System.out.println(st.equals("가위") ? st + " 대 보\n승리" : st.equals("보") ? st + " 대 보\n무승부" : st + " 대 보\n패배");
//		}
		
		final int GA = 0;
		final int BA = 1;
		final int BO = 2;
		int user, com;
		System.out.println("가위바위보 게임입니다.");
		while(true) {
			com = (int)(Math.random() * 3);
			do {
				System.out.println("0: 가위, 1: 바위, 2: 보");
				System.out.print("> ");
				user = sc.nextInt();
			} while(!(user == 0) && !(user == 1) && !(user == 2));
			
			System.out.println("컴퓨터 : " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			System.out.println("유저 : " + (user == 0 ? "가위" : (user == 1 ? "바위" : "보")));
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user == GA)) {
				System.out.println("유저 승");
				score += 100;
			} else if (com == user) {
				System.out.println("비김");
				score += 10;
			} else {
				System.out.println("컴퓨터 승");
				life--;
			}
			System.out.println("--------------------");
			System.out.println("점수 : " + score + " 목숨 : " + life);
			System.out.println("--------------------");
			if(life == GA) {
				System.out.println("『GAME OVER』");
				break;
			}
		}
		sc.close();
	}

}
