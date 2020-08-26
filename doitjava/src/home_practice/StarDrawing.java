package home_practice;

import java.util.Scanner;

public class StarDrawing {

	public static void main(String[] args) {
		int linenum = 0, spaces = 0, stars = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("별 그리기 머신입니다.");
		System.out.println("숫자를 입력하세요.");
		System.out.print(">");
		linenum = sc.nextInt();
		spaces = linenum - 1;
		
		for(int i = 0; i < linenum; i++) {
			for(int j = spaces; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = stars; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
			if(i<(linenum/2)) {
				spaces--;
				stars += 2;	
			} else {
				spaces++;
				stars -= 2;
			}
		}
		sc.close();
		
		
		
	}

}
