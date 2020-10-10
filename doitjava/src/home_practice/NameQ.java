package home_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class NameQ {
	public static void main(String[] args) {
		System.out.println("이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌");
		String a = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] as = a.split(",");
		HashSet<String> as2 = new HashSet<>();
		int kimCnt = 0;
		int leeCnt = 0;
		int ljyCnt = 0;
		final String KIM = "김";
		final String LEE = "이";
		final String LJY = "이재영";
		
		for(int i = 0; i < as.length; i++) {
			String k = as[i];
			as2.add(as[i]);
			if(k.substring(0, 1).equals(KIM)) {
				kimCnt++;
			} else if(k.substring(0, 1).equals(LEE)) {
				leeCnt++;
			}
			if(k.equals(LJY)) {
				ljyCnt++;
			}
		}
		
		System.out.println("1.김씨:" + kimCnt + "명, 이씨:" + leeCnt + "명");
		System.out.println("2.이재영:" + ljyCnt + "회");
		System.out.println("중복 제거:" + as2);
		String[] as3 = new String[as2.size()];
		Iterator<String> it = as2.iterator();
		for(int i = 0; it.hasNext(); i++) {
			as3[i] = it.next();
		}
		Arrays.sort(as3);
		System.out.print("정렬:");
		for(int i = 0; i < as3.length; i++) {
			System.out.print(as3[i] + " ");
		}
	}
}
