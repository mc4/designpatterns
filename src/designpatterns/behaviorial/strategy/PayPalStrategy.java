package designpatterns.behaviorial.strategy;

public class PayPalStrategy implements PaymentStrategy {

	@Override
	public void pay(int pay) {
		System.out.println("Paying with Pay Pal");
	}

}
