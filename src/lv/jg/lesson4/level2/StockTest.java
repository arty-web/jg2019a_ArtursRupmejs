package lv.jg.lesson4.level2;

public class StockTest {
	
	public static void main(String[] args) {
		
		System.out.println("Today we saw:");
		
		Stock amazon = new Stock("Amazon", 125.49);
		amazon.updatePrice(126.12);
		amazon.updatePrice(127.03);
		amazon.updatePrice(125.70);
		amazon.updatePrice(123.99);
		amazon.updatePrice(125.51);
		amazon.updatePrice(126.14);
		amazon.updatePrice(126.87);
		amazon.printInformation();
		
		Stock apple = new Stock("Apple", 95.20);
		apple.updatePrice(101.95);
		apple.updatePrice(97.00);
		apple.updatePrice(97.00);
		apple.updatePrice(94.22);
		apple.updatePrice(105.19);
		apple.updatePrice(104.66);
		apple.updatePrice(99.44);
		apple.printInformation();
		
	}

}