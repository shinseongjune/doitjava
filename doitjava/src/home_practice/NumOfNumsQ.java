package home_practice;

import java.util.HashMap;

public class NumOfNumsQ {
	public static void main(String[] args) {
		HashMap<Integer, Integer> all = new HashMap<>();
		
		for(int i=0;i<=9;i++) {
			all.put(i, 0);
		}
		
		for(Integer i=1;i<=1000;i++) {
			for(String k:i.toString().split("")) {
				int m = Integer.parseInt(k);
				all.put(m, all.get(m) + 1);
			}
		}
		
		System.out.println(all);
	}	
}
