package example;

public class Overflow {

	public static void main(String[] args) {
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		int iNum = Integer.MIN_VALUE;
		System.out.println(iNum);
		iNum--;
		System.out.println(iNum);
//		int val = !100;
		double dVal = 10.0 % 3.0;
	}

}
