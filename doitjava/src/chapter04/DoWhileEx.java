package chapter04;

public class DoWhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int num = 20;
		do {
			sum += num++;
		} while(num <= 10);
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		num = 20;
		sum = 0;
		while(num <= 10) {
			sum += num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

	}

}
