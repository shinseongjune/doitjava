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
			
			//��ĳ��;����[i]=�ؽ�Ʈ��Ʈ; ����(0<����<10�ƴϸ�){1~9���Է°��� i-- continue } for(intj=0 j<i ) syso �������Է� i-- break return user
			
			//comparearry(com,user) result=int[2] for(i=0;i<com.length; i++) { for(intj=0;j<user.length;j++) if(com[i]==user[j]) result[1]++;
			//for(int i=0 i<com.length; i++) { if(com[i] == user[i]) result[0]++ result[1]-- return result
			
			cnt++;
			if(cnt==12) {
				System.out.println("��+-+-+-+-+��");
				System.out.println("+Game Over+");
				System.out.println("��+-+-+-+-+��");
				break;
			}
		}
		System.out.println("������ [" + t.target[0] + "] [" + t.target[1] + "] [" + t.target[2] + "] �Դϴ�.");
		sc.close();
	}
}
