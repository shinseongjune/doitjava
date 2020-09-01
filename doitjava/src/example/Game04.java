package example;

import java.util.Scanner;

public class Game04 {

	public static void main(String[] args) {
		//1부터 입력받은 숫자 n(최대 1_000_000)까지의 소수의 개수를 출력하는 프로그램.
		Scanner sc = new Scanner(System.in);
		int num = 0, cnt = 0;
		boolean sosu = true;
		
		System.out.println("소수 세기 프로그램입니다.");
		while(num < 1 || num > 1_000_000) {
			System.out.print("1부터 1,000,000까지 숫자 중 하나를 입력하십시오 :");
			num = sc.nextInt();
		}
		
		sc.close();
	}

}
