package game;

public class Play {
	public static void main(String[] args) {
		
		Target t = new Target();
		UserInput us = new UserInput();
		
		t.makeTarget();
		
		while(true) {
			us.input();
			CompareArr comp = new CompareArr(t,us);
			
			if(comp.strike==3) {
				System.out.println("������ [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] �Դϴ�.");
				System.out.println(c.cnt + "ȸ���� �¸��߽��ϴ�!");
				break;
			Counting c = new Counting();
			if(c.cnt == 12) {
				System.out.println("������ [" + t.target[0] + ", " + t.target[1] + ", " + t.target[2] + "] �Դϴ�.");
			}
			}
			System.out.println(comp.strike + " ��Ʈ����ũ, " + comp.ball + " ��");
		}
		us.cl();
	}
}
