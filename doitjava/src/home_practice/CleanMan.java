package home_practice;

public class CleanMan extends Man {
	//필드
	int wash;
	
	//생성자
	CleanMan(String name, int age, int weight, int wash) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.wash = wash;
	}
	
	//메소드

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("설거지는 " + wash + "번 했습니다.");
	}
	
}
