package example;

import java.util.Scanner;

/*
 * 국어 영어 수학 점수를 입력받아서
 * 평균을 출력한 후
 * 100 ~ 91 A등급
 * 90 ~ 91 B등급
 * 80 ~ 71 C등급
 * 나머지는 F등급
 * 
 * 평균 점수와 등급을 출력하세요.
 */


public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gook, eng, su;
		double avg;
		
		System.out.println("국어 점수를 입력하세요.");
		gook = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		su = sc.nextInt();
		
		char grade = 0;
		avg = (gook + eng + su) / 3;
		System.out.println("평균은 " + avg + "점입니다.");
		
		
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
		System.out.println(grade + "등급입니다.");
		
		sc.close();
	}

}
