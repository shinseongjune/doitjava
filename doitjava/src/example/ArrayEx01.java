package example;

public class ArrayEx01 {

	public static void main(String[] args) {
		// �ҹ��� 'a'���� 'z'���� ���ڿ��� ����ϴ� �ڵ带 �迭�� �̿��ؼ� �ۼ��ϼ���.
		char[] arr = new char[26];
		char alb = 'a';
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = alb++;
//		}
//		for(int i = 0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int i =0; i<arr.length;i++) {
			arr[i] = (char)('a' + i);
		}
		System.out.println(arr);
	}

}
