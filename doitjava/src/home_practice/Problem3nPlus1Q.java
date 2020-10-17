package home_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Problem3nPlus1Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		int num;
		int res = -1;
		do {
			System.out.print("첫 번째 숫자:");
			i = sc.nextInt();
			System.out.print("두 번째 숫자:");
			j = sc.nextInt();
		} while(i<=0 || j<=0);
		if(i>j) {
			i = i + j;
			j = i - j;
			i = i - j;
		}
		List<Integer> arr = new ArrayList<>();
		for(int k = 0;k<j-i+1;k++) {
			arr.add(i+k);
		}
		Iterator<Integer> it = arr.iterator();
		for(;it.hasNext();) {
			num = (int)it.next();
			int cnt = 1;
			while(num != 1) {
				if(num%2==0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}
				cnt++;
			}
			if(res == -1) {
				res = cnt;
			} else {
				if(res<cnt) res = cnt;
			}
		}
		System.out.println(i + "\t" + j + "\t" + res);
	}
}
