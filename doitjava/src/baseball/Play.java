package baseball;

import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������������������������");
		System.out.println("��Play Ball!!��");
		System.out.println("��������������������������");
		
		Target t = new Target();
		t.makeTarget();
		int[] user = new int[3];
		int cnt=1;
		
		while(true) {
			System.out.println("* ī��Ʈ: " + cnt);
			System.out.print("1��° ����: ");
			user[0] = sc.nextInt();
			System.out.print("2��° ����: ");
			user[1] = sc.nextInt();
			System.out.print("3��° ����: ");
			user[2] = sc.nextInt();
			
			
			
			cnt++;
			if(cnt==12) {
				System.out.println("��+-+-+-+-+��");
				System.out.println("+Game Over+");
				System.out.println("��+-+-+-+-+��");
				break;
			}
		}
		
		sc.close();
	}
}
