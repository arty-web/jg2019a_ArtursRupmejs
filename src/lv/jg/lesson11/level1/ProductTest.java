import java.util.ArrayList;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {

		Product product = new Product();

		List<Product> myShoppingList = new ArrayList<>();
		product.setList(myShoppingList, "myShoppingList");

		addProductToList("Cucumber", 2.85, Category.VEGETABLES, myShoppingList);
		addProductToList("Avocado", 1.33, Category.VEGETABLES, myShoppingList);
		addProductToList("Pineapple", 1.10, Category.FRUITS, myShoppingList);
		addProductToList("Kellogs Frostflakes", 3.20, Category.BREAKFAST_CEREALS, myShoppingList);
		addProductToList("Peanut M&Ms", 1.15, Category.SWEETS, myShoppingList);
		addProductToList("Pepsi Max 0.33L", 0.52, Category.SOFT_DRINKS, myShoppingList);
		addProductToList("Pepsi Max 1.5L", 1.22, Category.SOFT_DRINKS, myShoppingList);
		addProductToList("Bacardi 1L", 12.99, Category.ALCOHOL, myShoppingList);

		removeProductFromList("Pepsi Max 0.33L", myShoppingList);
		removeProductFromList("Avocado", myShoppingList);

		displayEntireProductList(myShoppingList);

		addProductToList("Green peas", 1.75, Category.CANNED_FOOD, myShoppingList);
		addProductToList("Jameson 1L", 11.99, Category.ALCOHOL, myShoppingList);
		addProductToList("Grapes", 2.05, Category.FRUITS, myShoppingList);

		displayProductsInPriceRange(0.75, 1.75, myShoppingList);

		displayProductsInCategory(Category.ALCOHOL, myShoppingList);
		
		saveProductsIntoTxtFile(myShoppingList);
		loadProductFromTxtFile(myShoppingList);

	}

	private static void addProductToList(String name, double price, Category category, List<Product> shopList) {
		shopList.add(new Product(name, price, category));
		System.out.print(" + New product was added. ");
		System.out.println("[name:'" + name + "', price:'" + price + " EUR', category:'"+ category + "']");
	}

	private static void removeProductFromList(String name, List<Product> shopList) {
		shopList.removeIf(n -> (n.getName() == name));
		System.out.println(" - Certain product was removed. [name:'" + name + "']");
	}

	private static void displayEntireProductList(List<Product> shopList) {
		System.out.println("\n==> All products currently in the list: ");
		System.out.println(shopList + "\n");
	}

	private static void displayProductsInPriceRange(double rangeFrom, double rangeTo, List<Product> shopList) {
		System.out.println("\n==> All products priced from " + rangeFrom + " EUR to " + rangeTo + " EUR currently in the list: ");
		for (Product product : shopList) {
			if (product.getPrice() >= rangeFrom && product.getPrice() <= rangeTo) {
				System.out.println(product);
			}
		}
	}
	
	private static void displayProductsInCategory(Category category, List<Product> shopList) {
		System.out.println("\n==> All products from category '" + category + "' currently in the list: ");
		for (Product product : shopList) {
			if (product.getCategory() == category) {
				System.out.println(product);
			}
		}
		
	}
	
	private static void saveProductsIntoTxtFile(List<Product> shopList) {
		// TODO Auto-generated method stub
	}
	
	private static void loadProductFromTxtFile(List<Product> shopList) {
		// TODO Auto-generated method stub
	}
	
}
