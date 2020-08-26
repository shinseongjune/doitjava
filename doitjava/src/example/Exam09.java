package example;

public class Exam09 {

	public static void main(String[] args) {
		System.out.println("1부터 50까지의 합의 평균");
		double res = 0;
		for(int i = 1; i<51;i++) {
			res +=i;
		}
		System.out.println(res/50);
	}

}
