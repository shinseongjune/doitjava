package home_practice;

import java.util.Scanner;

public class RockPaper2 {

	public static void main(String[] args) {
		final String SCISSORS = "����";
		final String ROCK = "����";
		final String PAPER = "��";
		
		int score = 0, life = 3;
		
		Scanner sc = new Scanner(System.in);
		String userChoice = "";
		while(true) {
			do {
			System.out.print("���� ���� > ");
			userChoice = sc.next();
			} while(!userChoice.equals("����") && !userChoice.equals("����") && !userChoice.equals("��"));
			
			String comChoice = "";
			int ranNum = (int)(Math.random() * 3);
			
			switch(ranNum) {
			case 0:
				comChoice = "����";
				break;
			case 1:
				comChoice = "����";
				break;
			case 2:
				comChoice = "��";
			}
			
			if((comChoice.equals(SCISSORS) && userChoice.equals(ROCK)) || (comChoice.equals(ROCK) && userChoice.equals(PAPER)) ||(comChoice.equals(PAPER) && userChoice.equals(SCISSORS))) {
				System.out.println("��" + userChoice + "�� �� " + comChoice);
				System.out.println("[�¸�!]");
				score += 100;
			} else if(comChoice.equals(userChoice)) {
				System.out.println("��" + userChoice + "�� �� " + comChoice);
				System.out.println("[���º�.]");
				score += 10;
			} else {
				System.out.println("��" + userChoice + "�� �� " + comChoice);
				System.out.println("[�й�...]");
				life--;
			}
			System.out.println("------------------");
			System.out.println("���� : " + score + ", ��� : " + life);
			System.out.println("------------------");
			
			if(life == 0) {
				System.out.println("��GAME OVER��")	;
				break;
			}
		}
		
		sc.close();
	}

}
