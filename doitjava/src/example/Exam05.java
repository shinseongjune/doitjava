package example;

public class Exam05 {

	public static void main(String[] args) {
		System.out.println("1���� 50���� 3�� ����� ��");
		int res = 0;
		for (int i = 1; i < 51; i++) {
			if(i%3==0) {
				res += i;
			}
		}
		System.out.println(res);
	}

}
