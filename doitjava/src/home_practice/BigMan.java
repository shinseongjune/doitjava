package home_practice;

public class BigMan extends Man {
	//필드
	int height = 200;
	
	//생성자
	public BigMan() {
		super("큰머리", 17, 170);
	}
	
	//메소드
	public void getTall() {
		height++;
		System.out.println(height + "cm까지 자랐습니다.");
	}
	
	@Override
	public void showInfo() {
		System.out.println("이름은 " + name + ", 나이는" + age + "살, 체중은 " + weight + "kg, 키는 " + height + "cm");
	}
}
