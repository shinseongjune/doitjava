package example;

public class Exam04 {
	public static void main(String[] args) {
		int res = 0;
		System.out.println("1부터 10까지의 수 중 짝수의 합");
		for(int i = 1;i < 11;i++) {
			if((i % 2) == 0) {
				res += i;
			}
		}
		System.out.println(res);
	}
}
