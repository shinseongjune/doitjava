package chapter04;

import java.util.Scanner;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("���ٹ��Դϴ�.");
		System.out.println("�޴��� �ֹ��� �ּ���.");
		Scanner sc = new Scanner(System.in);
		String menu = "";
		System.out.println("A: �Ƹ޸�ī��, M: ī���ī, C: ī��Ḷ���ƶ�, T: ������ Ŀ��");
		System.out.print("> ");
		menu = sc.next();
		
//		switch(menu.toUpperCase()) { //���ڸ� �빮�ڷ� ����
		//toLowerCase() ���ڸ� �ҹ��ڷ� ����
//		case "A" :
//			System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
//			break;
//		case "M" :
//			System.out.println("ī���ī�� �ֹ��ϼ̽��ϴ�.");
//			break;
//		case "C" :
//			System.out.println("ī��Ḷ���ƶǸ� �ֹ��ϼ̽��ϴ�.");
//			break;
//		case "T" :
//			System.out.println("������ Ŀ�Ǹ� �ֹ��ϼ̽��ϴ�.");
//			break;
//		default :
//			System.out.println("���� �޴��Դϴ�. �ٽ� �������ּ���.");
//		}
		
		switch(menu) {
		case "A" :
		case "a"
			System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
			break;
		case "M" :
		case "m" :
			System.out.println("ī���ī�� �ֹ��ϼ̽��ϴ�.");
			break;
		case "C" :
		case "c" :
			System.out.println("ī��Ḷ���ƶǸ� �ֹ��ϼ̽��ϴ�.");
			break;
		case "T" :
		case "t" :
			System.out.println("������ Ŀ�Ǹ� �ֹ��ϼ̽��ϴ�.");
			break;
		default :
			System.out.println("���� �޴��Դϴ�. �ٽ� �������ּ���.");
		}
		sc.close();
	}
}