package home_practice;

public class MultipleQ1 {
	static int res = 0;
	
	static void multiQ(int s) {
		if(s%3==0 || s%5==0) {
			System.out.println(s);
			res += s;
		}
	}
	
}
