package game;

public class Play {
	public static void main(String[] args) {
		
		Target t = new Target();
		UserInput us = new UserInput();
		
		t.makeTarget();
		int cnt=1;
		
		while(true) {
			us.input();
			CompareArr comp = new CompareArr(t,us);
			
			if(comp.strike==3) {
				System.out.println("������ [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] �Դϴ�.");
				System.out.println(cnt + "ȸ���� �¸��߽��ϴ�!");
				break;
			}
			System.out.println(comp.strike + " ��Ʈ����ũ, " + comp.ball + " ��");
			cnt++;
			if(cnt==12) {
				System.out.println("��+-+-+-+-+��");
				System.out.println("+Game Over+");
				System.out.println("��+-+-+-+-+��");
				System.out.println("������ [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] �Դϴ�.");
				break;
			}
		}
		us.cl();
	}
}
