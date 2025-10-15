package week3day3;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		
		Amazon obj = new Amazon();
		obj.cardPayments();
		obj.cashOnDelivery();
		obj.upiPayments();
		obj.onlinePayments();
		obj.recordPaymentDetails();

	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery limit:20000 - Amazon");
	}

	@Override
	public void upiPayments() {
		
		System.out.println("Upi Payment limit:30000 - Amazon  ");
	}
		

	@Override
	public void cardPayments() {
		System.out.println("Card Payments limit : 50000 - Amazon");
	}

	@Override
	public void onlinePayments() {
		System.out.println("Online Payment limit:100000 - Amazon");

	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment Details Updated successfully - Amazon");
	}

}
