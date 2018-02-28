package packageCore;

public class CarPayment

{

	private double ttlP;
	private double dwnP;
	private int lngthofL;
	private double intR;

	public CarPayment(double tP, double downP, int length, double iR)
	{
		this.ttlP = tP;
		this.dwnP = downP;
		this.lngthofL = length;
		this.intR = iR;
	}
	
	public double calculateMonthlyPayment()
	{
		double interest12 = (this.intR)/12;
		double num = interest12 * (ttlP - dwnP);
		double denom = (1 - Math.pow((1 + interest12), -lngthofL));
		return num/denom;
	}

	public double calculateTotalInterest()
	{
		return (this.calculateMonthlyPayment() - ((ttlP - dwnP) / lngthofL)) * lngthofL;
	}

	public double getTotalPrice() {
		return ttlP;
	}

	public void setTotalPrice(double totalPrice) {
		this.ttlP = totalPrice;
	}

	public double getDownPayment() {
		return dwnP;
	}

	public void setDownPayment(double downPayment) {
		this.dwnP = downPayment;
	}

	public int getLengthOfLoan() {
		return lngthofL;
	}

	public void setLengthOfLoan(int lengthOfLoan) {
		this.lngthofL = lengthOfLoan;
	}

	public double getInterestRate() {
		return intR;
	}

	public void setInterestRate(double interestRate) {
		this.intR = interestRate;
	}
}