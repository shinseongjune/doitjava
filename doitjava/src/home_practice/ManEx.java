package home_practice;

public class ManEx {

	public static void main(String[] args) {
		Man hong = new Man("ȫ�浿", 16, 60);
		CleanMan kim = new CleanMan("��浿", 16, 70, 10);
		
		hong.showInfo();
		kim.showInfo();
		hong.getOld();
		hong.showInfo();
	}

}
