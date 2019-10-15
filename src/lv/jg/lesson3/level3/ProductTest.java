package lv.jg.lesson3.level3;

public class ProductTest {

    public static void main(String[] args) {

        Product coke = new Product("Coca-cola");
        coke.setRegularPrice(1.90);
        coke.setDiscount(0.15);

        Product pepsi = new Product("Pepsi");
        pepsi.setRegularPrice(1.65);
        pepsi.setDiscount(0.12);

        Product fantastika = new Product("Fantastika");
        fantastika.setRegularPrice(1.10);
        fantastika.setDiscount(0.40);

        coke.printInformation();
        pepsi.printInformation();
        fantastika.printInformation();

    }

}
