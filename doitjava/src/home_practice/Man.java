package home_practice;

public class Man {
	//�ʵ�
	String name;
	int age;
	int weight;
	
	//������
	Man() {
		
	};
	
	Man(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	
	//�޼ҵ�
	public void getOld() {
		age++;
		System.out.println(age + "���� �Ǿ����ϴ�.");
	}
	
	public void showInfo() {
		System.out.println("�̸��� " + name + ", ���̴�" + age + "��, ü���� " + weight + "kg");
	}
}
