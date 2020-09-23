package baseball;

public class Target {
	
	int[] target = new int[3];
	
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
