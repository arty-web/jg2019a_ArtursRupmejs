package lv.jg.lesson4.level4;

//Ok
public class CreditCardTest {
	
	public static void main(String[] args) {
		
		CreditCard card1 = new CreditCard();
		card1.setOverdraftLimit(500);
		card1.setCardNumber("1111 2222 3333 4444");
		
		card1.topup(160, "1002");
		card1.topup(160, "1001");
		card1.withdraw(750, "1001");
		card1.withdraw(250.50, "1001");
		card1.withdraw(310, "1011");
		card1.withdraw(310, "1001");
		card1.topup(650, "1001");
	}

}