package home_practice;

import java.util.HashSet;

public class FiboQ {
	public static void main(String[] args) {
		HashSet<Integer> evenFi = new HashSet<>();
		Fibo1 fi = new Fibo1();
		int result = 0;
		
		long k = System.currentTimeMillis();
		for(int i=1;result<4_000_000;i++) {
			result = fi.getFibo(i);
			if(result%2 == 0) {
				evenFi.add(result);
			}
		}
		
		result = evenFi.stream().mapToInt(x->x.intValue()).sum();
		long l = System.currentTimeMillis();
		System.out.println(result);
		System.out.println("걸린 시간: " + (l - k)/1000.0);
	}
}
