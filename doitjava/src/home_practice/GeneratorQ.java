package home_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class GeneratorQ {
	public static void main(String[] args) {
		HashSet<Integer> all = new HashSet<>();
		HashSet<Integer> nonSelfNum = new HashSet<>();
		int k = 0;
		
		for(int i=1;i<=5000;i++) {
			all.add(i);
		}
		System.out.println("all = " + all);
		
		for(int i=1;i<=5000;i++) {
			String s = Integer.toString(i);
			String[] arr = s.split("");
			k = 0;
			for(String a:arr) {
				k += Integer.parseInt(a);
			}
			k += i;
			nonSelfNum.add(k);
		}
		System.out.println("Non-SelfNumber : " + nonSelfNum);
		System.out.println();
		
		all.removeAll(nonSelfNum);
		System.out.println("SelfNumber : " + all);
		System.out.println("-----------------------------------");
		System.out.println();
		
		long start = System.nanoTime();
		
		k = 0;
		for(Iterator<Integer> it = all.iterator();it.hasNext();) {
			k += it.next();
		}
//		k = all.stream().mapToInt(x->x.intValue()).sum();
		
		long end = System.nanoTime();
		
		System.out.println("answer : " + k);
		System.out.println("�ð�: " + (end - start));
	}
}
