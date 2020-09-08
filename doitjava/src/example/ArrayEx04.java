package example;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		//인덱스의 값은 앞의 두 인덱스 값을 더해서 대입하고
		//arr의 값을 모두 출력하세요.
		for(int i = 2; i<arr.length;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
