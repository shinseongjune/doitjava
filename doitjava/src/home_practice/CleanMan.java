package home_practice;

public class CleanMan extends Man {
	//�ʵ�
	int wash;
	
	//������
	CleanMan(String name, int age, int weight, int wash) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.wash = wash;
	}
	
	//�޼ҵ�

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�������� " + wash + "�� �߽��ϴ�.");
	}
	
}
