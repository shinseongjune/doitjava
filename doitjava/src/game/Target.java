package game;

public class Target {
	
	int[] target = new int[3];
	
	Target() {
		System.out.println("忙成式成式成式成式成式成忖");
		System.out.println("戍Play Ball!!扣");
		System.out.println("戌扛式扛式扛式扛式扛式扛戎");
	}
	
	void makeTarget() {
		for(int i=0; i<3; i++) {
			target[i] = (int)(Math.random() * 9) + 1;
			for(int j=0; j<i; j++) {
				if(target[i] == target[j]) {
					i--;
					break;
				}
			}
		}
	}
}
