package example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է¹޾Ƽ�
 * ����� ����� ��
 * 100 ~ 91 A���
 * 90 ~ 91 B���
 * 80 ~ 71 C���
 * �������� F���
 * 
 * ��� ������ ����� ����ϼ���.
 */


public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gook, eng, su;
		double avg;
		
		System.out.println("���� ������ �Է��ϼ���.");
		gook = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		su = sc.nextInt();
		
		char grade = 0;
		avg = (gook + eng + su) / 3;
		System.out.println("����� " + avg + "���Դϴ�.");
		
		
//		if(avg <= 70) {
//			grade = 'F';
//		} else if(avg <= 80) {
//			grade = 'C';
//		} else if(avg <= 90) {
//			grade = 'B';
//		} else {
//			grade = 'A';
//		}
		switch((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';	
		}
		System.out.println(grade + "����Դϴ�.");
		
		sc.close();
	}

}
