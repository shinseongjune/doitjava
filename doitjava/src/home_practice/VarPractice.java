package home_practice;

public class VarPractice {

	public static void main(String[] args) {
//		var bNum; //�ڹ�10����
		int bNum;
		bNum = 1;
//		bNum = "string";
		System.out.println(bNum);
		
		byte aNum = 1;
		byte dNum = 2;
		byte cNum;
		cNum = (byte)(aNum + dNum); //������ int, double �켱
		System.out.println(cNum);
		
		double zNum = 1.0;
		double yNum = 1;
		System.out.println("zNum = " + zNum + ", yNum = " + yNum);
		
		zNum++;
		--yNum;
		System.out.println("zNum = " + zNum + ", yNum = " + yNum);
	}

}
