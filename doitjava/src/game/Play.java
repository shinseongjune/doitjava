package game;

public class Play {
	public static void main(String[] args) {
		
		Target t = new Target();
		UserInput us = new UserInput();
		
		t.makeTarget();
		
		while(true) {
			us.input();
			System.out.println(Counting.cnt + "회!");
			CompareArr comp = new CompareArr(t,us);
			
			if(comp.strike==3) {
				System.out.println("정답은 [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] 입니다.");
				System.out.println(Counting.cnt + "회만에 승리했습니다!");
				break;
			}
			Counting.count();
			if(Counting.gmover == 1) {
				System.out.println("┌+-+-+-+-+┐");
				System.out.println("+Game Over+");
				System.out.println("└+-+-+-+-+┘");
				System.out.println("정답은 [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] 입니다.");
				break;
			}
			System.out.println(comp.strike + " 스트라이크, " + comp.ball + " 볼");
		}
		us.cl();
	}
}
