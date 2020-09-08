package chapter07;

public class ObjCopy01 {

	public static void main(String[] args) {
		String[] arr1 = new String[] {"태백산맥", "조정래"};
		String[] arr2 = new String[5];
		
		System.arraycopy(arr1, 0, arr2, 0, 2);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println();
		arr1[0] = "데미안";
		arr1[1] = "헤세";
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
