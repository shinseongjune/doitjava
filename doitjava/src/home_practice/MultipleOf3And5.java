package home_practice;

import java.util.HashSet;

public class MultipleOf3And5 {
	public static void main(String[] args) {
		HashSet<Integer> all = new HashSet<>();
		for(int i = 0;i<1000;i++) {
			all.add(i+1);
		}
		
		all.stream().forEach(MultipleQ1::multiQ);
		System.out.println("´ä: " + MultipleQ1.res);
	}
}
