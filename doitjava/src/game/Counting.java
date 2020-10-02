package game;

public class Counting {
	static int cnt=1;
	static int gmover = 0;
	static void count() {
		cnt++;
		if(cnt==13) {
			gmover = 1;
		}
	}
}
