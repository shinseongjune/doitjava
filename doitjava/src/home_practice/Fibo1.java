package home_practice;

public class Fibo1 {

	public int getFibo(int n) {
		int numA = 0;
		int numB = 1;
		int numC = 0;
		if(n<=1) {
			return numA;
		} else if(n ==2) {
			return numB;
		} else {
			for(int i=0; i<n-2;i++) {
				numC = numA + numB;
				numA = numB;
				numB = numC;
			}
			return numC;
		}
	}
}
