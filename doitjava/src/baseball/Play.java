package baseball;

import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("┌┬─┬─┬─┬─┬─┬┐");
		System.out.println("├Play Ball!!┤");
		System.out.println("└┴─┴─┴─┴─┴─┴┘");
		
		Target t = new Target();
		t.makeTarget();
		int[] user = new int[3];
		int cnt=1;
		
		while(true) {
			System.out.println("* 카운트: " + cnt);
			System.out.print("1번째 숫자: ");
			user[0] = sc.nextInt();
			System.out.print("2번째 숫자: ");
			user[1] = sc.nextInt();
			System.out.print("3번째 숫자: ");
			user[2] = sc.nextInt();
			
			//스캐너;유저[i]=넥스트인트; 이프(0<유저<10아니면){1~9만입력가능 i-- continue } for(intj=0 j<i ) syso 같은값입력 i-- break return user
			
			//comparearry(com,user) result=int[2] for(i=0;i<com.length; i++) { for(intj=0;j<user.length;j++) if(com[i]==user[j]) result[1]++;
			//for(int i=0 i<com.length; i++) { if(com[i] == user[i]) result[0]++ result[1]-- return result
			
			cnt++;
			if(cnt==12) {
				System.out.println("┌+-+-+-+-+┐");
				System.out.println("+Game Over+");
				System.out.println("└+-+-+-+-+┘");
				break;
			}
		}
		System.out.println("정답은 [" + t.target[0] + "] [" + t.target[1] + "] [" + t.target[2] + "] 입니다.");
		sc.close();
	}
}
