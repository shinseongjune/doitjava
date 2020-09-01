package example;

import java.util.Scanner;

public class Game04 {

	public static void main(String[] args) {
		// 1부터 입력받은 숫자 n(최대 1_000_000)까지의 소수의 개수를 출력하는 프로그램.
		Scanner sc = new Scanner(System.in);
		int num = 0, cnt = 0;
		boolean sosu;

		System.out.println("소수 세기 프로그램입니다.");
		while (num < 1 || num > 1_000_000) {
			System.out.print("1부터 1,000,000까지 숫자 중 하나를 입력하십시오 :");
			num = sc.nextInt();
		}

		for (int i = 2; i <= num; i++) {
			sosu = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					sosu = false;
					break;
				}
			}
			if (sosu == true) {
				cnt++;
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("소수의 개수는 " + cnt + "개입니다.");

		sc.close();
	}

}
