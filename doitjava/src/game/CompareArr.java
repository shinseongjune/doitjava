package game;

public class CompareArr {
	int strike, ball;
	
	CompareArr(Target t, UserInput u){
		strike = 0;
		ball = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(t.target[i] == u.userInput[j]) {
					ball++;
				}
			}
		}
		for(int i=0;i<3;i++) {
			if(t.target[i] == u.userInput[i]) {
				strike++;
				ball--;
			}
		}
	}
}
