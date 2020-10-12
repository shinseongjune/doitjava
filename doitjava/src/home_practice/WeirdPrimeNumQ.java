package home_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class WeirdPrimeNumQ {
	public static void main(String[] args) {
//		System.out.println("1487, 4817, 8147은 3330씩 증가하는 등차수열(arithmetic sequence)이다. 이 세 개의 수는 특이한 점이 있는데, 셋 다 소수이면서, 셋은 서로 자리에 있는 숫자만 바꾼 수들이라는 것이다.\r\n" + 
//				"\r\n" + 
//				"이러한 특성(+-3330 등차수열, 소수, 자리만 바꾼 수)을 보이는 한 자리, 두 자리, 세 자리인 소수는 없다. 그러나 네 자리 숫자 중 이러한 특성을 보이는 숫자들이 한 세트 더 있다.\r\n" + 
//				"\r\n" + 
//				"이 숫자들을 작은 것부터 순서대로 연결하여 만들 수 있는 12자리 숫자는 무엇인가? 예) 1487, 4817, 8147 -> 148748178147");
//		System.out.println();

		// 1000~3339까지 소수 찾기, 3330/6660 더해서 소수인 수 선별, 각 자리 수 같은지 확인. -> 합쳐서 수 만들기
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
				System.out.println("정답: " + answer1 + answer2 + answer3);
			}
			a1Set.clear();
			a2Set.clear();
			a3Set.clear();
		}
	}
}
