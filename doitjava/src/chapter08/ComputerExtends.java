package chapter08;

public class ComputerExtends extends CalculatorExtends {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCircle()");
		return Math.PI * r * r;
	}
}
