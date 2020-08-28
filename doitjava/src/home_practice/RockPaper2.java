package home_practice;

import java.util.Scanner;

public class RockPaper2 {

	public static void main(String[] args) {
		final String SCISSORS = "가위";
		final String ROCK = "바위";
		final String PAPER = "보";
		
		int score = 0, life = 3;
		
		Scanner sc = new Scanner(System.in);
		String userChoice = "";
		while(true) {
			do {
			System.out.print("가위 바위 > ");
			userChoice = sc.next();
			} while(!userChoice.equals("가위") && !userChoice.equals("바위") && !userChoice.equals("보"));
			
			String comChoice = "";
			int ranNum = (int)(Math.random() * 3);
			
			switch(ranNum) {
			case 0:
				comChoice = "가위";
				break;
			case 1:
				comChoice = "바위";
				break;
			case 2:
				comChoice = "보";
			}
			
			if((comChoice.equals(SCISSORS) && userChoice.equals(ROCK)) || (comChoice.equals(ROCK) && userChoice.equals(PAPER)) ||(comChoice.equals(PAPER) && userChoice.equals(SCISSORS))) {
				System.out.println("★" + userChoice + "★ 대 " + comChoice);
				System.out.println("[승리!]");
				score += 100;
			} else if(comChoice.equals(userChoice)) {
				System.out.println("★" + userChoice + "★ 대 " + comChoice);
				System.out.println("[무승부.]");
				score += 10;
			} else {
				System.out.println("★" + userChoice + "★ 대 " + comChoice);
				System.out.println("[패배...]");
				life--;
			}
			System.out.println("------------------");
			System.out.println("점수 : " + score + ", 목숨 : " + life);
			System.out.println("------------------");
			
			if(life == 0) {
				System.out.println("『GAME OVER』")	;
				break;
			}
		}
		
		sc.close();
	}

}
