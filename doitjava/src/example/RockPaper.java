package example;

import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = "";
		int score = 0;
		int life = 3;
//		do {
//			System.out.print("���� ���� > ");
//			st = sc.next();
//		} while(!st.equals("����") && !st.equals("����") && !st.equals("��"));
//		
//		int opponent = (int)(Math.random() * 3) + 1; //1:���� 2:���� 3:��
//		
//		switch(opponent) {
//		case 1:
//			System.out.println(st.equals("����") ? st + " �� ����\n�¸�" : st.equals("����") ? st + " �� ����\n���º�" : st + " �� ����\n�й�");
//			break;
//		case 2:
//			System.out.println(st.equals("��") ? st + " �� ����\n�¸�" : st.equals("����") ? st + " �� ����\n���º�" : st + " �� ����\n�й�");
//			break;
//		case 3:
//			System.out.println(st.equals("����") ? st + " �� ��\n�¸�" : st.equals("��") ? st + " �� ��\n���º�" : st + " �� ��\n�й�");
//		}
		
		final int GA = 0;
		final int BA = 1;
		final int BO = 2;
		int user, com;
		System.out.println("���������� �����Դϴ�.");
		while(true) {
			com = (int)(Math.random() * 3);
			do {
				System.out.println("0: ����, 1: ����, 2: ��");
				System.out.print("> ");
				user = sc.nextInt();
			} while(!(user == 0) && !(user == 1) && !(user == 2));
			
			System.out.println("��ǻ�� : " + (com == 0 ? "����" : (com == 1 ? "����" : "��")));
			System.out.println("���� : " + (user == 0 ? "����" : (user == 1 ? "����" : "��")));
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user == GA)) {
				System.out.println("���� ��");
				score += 100;
			} else if (com == user) {
				System.out.println("���");
				score += 10;
			} else {
				System.out.println("��ǻ�� ��");
				life--;
			}
			System.out.println("--------------------");
			System.out.println("���� : " + score + " ��� : " + life);
			System.out.println("--------------------");
			if(life == GA) {
				System.out.println("��GAME OVER��");
				break;
			}
		}
		sc.close();
	}

}
