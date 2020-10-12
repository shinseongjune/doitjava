package home_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class WeirdPrimeNumQ {
	public static void main(String[] args) {
//		System.out.println("1487, 4817, 8147�� 3330�� �����ϴ� ��������(arithmetic sequence)�̴�. �� �� ���� ���� Ư���� ���� �ִµ�, �� �� �Ҽ��̸鼭, ���� ���� �ڸ��� �ִ� ���ڸ� �ٲ� �����̶�� ���̴�.\r\n" + 
//				"\r\n" + 
//				"�̷��� Ư��(+-3330 ��������, �Ҽ�, �ڸ��� �ٲ� ��)�� ���̴� �� �ڸ�, �� �ڸ�, �� �ڸ��� �Ҽ��� ����. �׷��� �� �ڸ� ���� �� �̷��� Ư���� ���̴� ���ڵ��� �� ��Ʈ �� �ִ�.\r\n" + 
//				"\r\n" + 
//				"�� ���ڵ��� ���� �ͺ��� ������� �����Ͽ� ���� �� �ִ� 12�ڸ� ���ڴ� �����ΰ�? ��) 1487, 4817, 8147 -> 148748178147");
//		System.out.println();

		// 1000~3339���� �Ҽ� ã��, 3330/6660 ���ؼ� �Ҽ��� �� ����, �� �ڸ� �� ������ Ȯ��. -> ���ļ� �� �����
		ArrayList<Integer> pNums = new ArrayList<>();
		boolean prime;
		for (int i = 1000; i < 3340; i++) {
			prime = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0)
					prime = false;
			}
			if (prime)
				pNums.add(i);
		}
		ArrayList<Integer> pNums2 = new ArrayList<>();
		for (int i = 0; i < pNums.size(); i++) {
			int num1 = pNums.get(i) + 3330;
			int num2 = num1 + 3330;
			prime = true;
			for (int j = 2; j < num1 / 2; j++) {
				if (num1 % j == 0)
					prime = false;
			}
			for (int j = 2; j < num2 / 2; j++) {
				if (num2 % j == 0)
					prime = false;
			}
			if (prime) {
				pNums2.add(pNums.get(i));
			}
		}
		int answer1 = 0;
		int answer2;
		int answer3;
		String a1;
		int a11;
		String a2;
		String a3;
		HashSet<String> a1Set = new HashSet<>();
		HashSet<String> a2Set = new HashSet<>();
		HashSet<String> a3Set = new HashSet<>();
		Iterator<Integer> it = pNums2.iterator();
		for (; it.hasNext();) {
			a1 = it.next().toString();
			a11 = Integer.valueOf(a1) + 3330;
			a2 = Integer.toString(a11);
			a11 = a11 + 3330;
			a3 = Integer.toString(a11);
			for (int j = 0; j < 4; j++) {
				a1Set.add(a1.split("")[j]);
				a2Set.add(a2.split("")[j]);
				a3Set.add(a3.split("")[j]);
			}
			if (a1Set.equals(a2Set) && a1Set.equals(a3Set)) {
				System.out.println(a1);
				answer1 = Integer.valueOf(a1);
				answer2 = answer1 + 3330;
				answer3 = answer2 + 3330;
				System.out.println("����: " + answer1 + answer2 + answer3);
			}
			a1Set.clear();
			a2Set.clear();
			a3Set.clear();
		}
	}
}
