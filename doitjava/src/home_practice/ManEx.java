package home_practice;

public class ManEx {

	public static void main(String[] args) {
		Man hong = new Man("È«±æµ¿", 16, 60);
		CleanMan kim = new CleanMan("±è±æµ¿", 16, 70, 10);
		
		hong.showInfo();
		kim.showInfo();
		hong.getOld();
		hong.showInfo();
	}

}
