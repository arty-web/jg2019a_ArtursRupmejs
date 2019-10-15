package lv.jg.lesson3.level3;

class Product {

    private String name;
    private double regularPrice, discount;

    public Product(String name) {
        this.name = name;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double calculateActualPrice() {
        double actualPrice = regularPrice - (regularPrice * discount);
        return actualPrice;
    }

    public void printInformation() {
        System.out.print("Product: name = " + name + ", ");
        System.out.printf("%s%.2f", "regular price = ", regularPrice);
        System.out.printf("%s%.0f", " EUR, discount = ", discount * 100);
        System.out.printf("%s%.2f%s", "%, actual price = ", calculateActualPrice(), " EUR.\n");
    }

}
