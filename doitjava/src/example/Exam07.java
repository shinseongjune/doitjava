package example;

public class Exam07 {

	public static void main(String[] args) {
		System.out.println("1���� 50������ �� �� 3�� ����� ����");
		int numof3 = 0;
		for(int i = 1; i<51; i++) {
			if(i%3==0) {
				numof3++;
			}
		}
		System.out.println(numof3);
	}

}
