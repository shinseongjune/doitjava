package home_practice;

public class BigMan extends Man {
	//�ʵ�
	int height = 200;
	
	//������
	public BigMan() {
		super("ū�Ӹ�", 17, 170);
	}
	
	//�޼ҵ�
	public void getTall() {
		height++;
		System.out.println(height + "cm���� �ڶ����ϴ�.");
	}
	
	@Override
	public void showInfo() {
		System.out.println("�̸��� " + name + ", ���̴�" + age + "��, ü���� " + weight + "kg, Ű�� " + height + "cm");
	}
}
