package game;

public class Play {
	public static void main(String[] args) {
		
		Target t = new Target();
		UserInput us = new UserInput();
		
		t.makeTarget();
		
		while(true) {
			us.input();
			System.out.println(Counting.cnt + "ȸ!");
			CompareArr comp = new CompareArr(t,us);
			
			if(comp.strike==3) {
				System.out.println("������ [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] �Դϴ�.");
				System.out.println(Counting.cnt + "ȸ���� �¸��߽��ϴ�!");
				break;
			}
			Counting.count();
			if(Counting.gmover == 1) {
				System.out.println("��+-+-+-+-+��");
				System.out.println("+Game Over+");
				System.out.println("��+-+-+-+-+��");
				System.out.println("������ [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] �Դϴ�.");
				break;
			}
			System.out.println(comp.strike + " ��Ʈ����ũ, " + comp.ball + " ��");
		}
		us.cl();
	}
}
