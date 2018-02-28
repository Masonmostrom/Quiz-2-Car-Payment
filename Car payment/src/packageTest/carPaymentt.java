package packageTest;



import static org.junit.Assert.*;
import org.junit.Test;
import packageCore.CarPayment;

public class carPaymentt {
	@Test
	public void test()
	{
		CarPayment car1 = new CarPayment(35000.0,0.0,60,.10);
		assertEquals((Math.round(car1.calculateMonthlyPayment() * 100) / 100.0), 743.65, .01);
		assertEquals((Math.round(car1.calculateTotalInterest() * 100) / 100.0), 9618.79, .01);
		
		CarPayment car2 = new CarPayment(10000.0,8000.0,24,.06);
		assertEquals((Math.round(car2.calculateMonthlyPayment() * 100) / 100.0), 88.64, .01);
		assertEquals((Math.round(car2.calculateTotalInterest() * 100) / 100.0), 127.39, .01);
	}
}