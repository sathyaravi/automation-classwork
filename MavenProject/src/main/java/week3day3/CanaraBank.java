package week3day3;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		
		System.out.println("Cash on Delivery limit:20000 ");
		
	}

	@Override
	public void upiPayments() {
		
		System.out.println("Upi Payment limit:30000  ");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments limit : 50000");
		
	}

	@Override
	public void onlinePayments() {
		System.out.println("Online Payment limit:100000");
		
	}
	
	public void recordPaymentDetails() {
		
		System.out.println("Payment Details Updated successfully");

	}
	

}
