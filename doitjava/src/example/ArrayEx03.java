package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 5개의 정수를 입력받아 배열에 넣고 입력받은 수 중 Max와 Min을 출력하세요.

//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		int max, min;
//		
//		for(int i = 0; i<arr.length;i++) {
//			System.out.print((i + 1) + "번 정수를 입력하세요 >");
//			arr[i] = sc.nextInt();
//		}
//		for(int i = 0; i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		max=arr[0];
//		min=arr[0];
//		for(int i = 1; i < arr.length;i++) {
//			if(max <= arr[i]) {
//				max = arr[i];
//			}
//			if(min >= arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println("max : " + max + ", min : " + min);
//		sc.close();

		int[] arr = new int[5];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력해 주세요: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		sc.close();
//		Arrays.sort(arr); // 오름차순 정렬
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("Max: " + arr[arr.length - 1]);
//		System.out.println("Min: " + arr[]);
		
	}

}
