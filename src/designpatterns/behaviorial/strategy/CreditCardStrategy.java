package designpatterns.behaviorial.strategy;

public class CreditCardStrategy implements PaymentStrategy {

	@Override
	public void pay(int pay) {
		System.out.println("Paying with credit card");
	}

}
