package chapter14;

import java.util.Scanner;

public class AutoCloseTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(AutoCloseObj obj = new AutoCloseObj()){
			int[] arr = new int[3];
			arr[3] = 100;
		} catch(Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
	}
}
