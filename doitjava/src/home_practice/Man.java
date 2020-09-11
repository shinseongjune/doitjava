package home_practice;

public class Man {
	//필드
	String name;
	int age;
	int weight;
	
	//생성자
	Man() {
		
	};
	
	Man(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	
	//메소드
	public void getOld() {
		age++;
		System.out.println(age + "살이 되었습니다.");
	}
	
	public void showInfo() {
		System.out.println("이름은 " + name + ", 나이는" + age + "살, 체중은 " + weight + "kg");
	}
}
