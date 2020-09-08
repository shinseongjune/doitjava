package example;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 소문자 'a'부터 'z'까지 문자열로 출력하는 코드를 배열을 이용해서 작성하세요.
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
