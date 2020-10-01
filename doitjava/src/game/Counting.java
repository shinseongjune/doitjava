package game;

public class Counting {
	static int cnt=1;
	
	Counting() {
		cnt++;
		if(cnt==12) {
			System.out.println("¦£+-+-+-+-+¦¤");
			System.out.println("+Game Over+");
			System.out.println("¦¦+-+-+-+-+¦¥");
		}
	}
}
