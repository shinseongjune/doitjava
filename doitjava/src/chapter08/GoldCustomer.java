package chapter08;

public class GoldCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio=0.1;
		this.agentID = agentID;
	}
	
	public GoldCustomer() {
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}
	
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);
//	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
