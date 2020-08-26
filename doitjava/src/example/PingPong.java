package example;

public class PingPong {

	public static void main(String[] args) {
//		for(int i = 1; i<101;i++) {
//			if(i%3==0 && i%5==0) {
//				System.out.println(i + " PingPong");
//			} else if(i%3==0) {
//				System.out.println(i + " Ping");
//			} else if(i%5==0) {
//				System.out.println(i + " Pong");
//			} else {
//				System.out.println(i);
//			}
//		}
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if(i % 3 == 0) {
				System.out.print("Ping");
			}
			if(i % 5 == 0) {
				System.out.print("Pong");
			}
			System.out.println();
		}
	}

}
