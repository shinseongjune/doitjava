package home_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class NameQ {
	public static void main(String[] args) {
		System.out.println("������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������");
		String a = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";
		String[] as = a.split(",");
		HashSet<String> as2 = new HashSet<>();
		int kimCnt = 0;
		int leeCnt = 0;
		int ljyCnt = 0;
		final String KIM = "��";
		final String LEE = "��";
		final String LJY = "���翵";
		
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
		
		System.out.println("1.�达:" + kimCnt + "��, �̾�:" + leeCnt + "��");
		System.out.println("2.���翵:" + ljyCnt + "ȸ");
		System.out.println("�ߺ� ����:" + as2);
		String[] as3 = new String[as2.size()];
		Iterator<String> it = as2.iterator();
		for(int i = 0; it.hasNext(); i++) {
			as3[i] = it.next();
		}
		Arrays.sort(as3);
		System.out.print("����:");
		for(int i = 0; i < as3.length; i++) {
			System.out.print(as3[i] + " ");
		}
	}
}
