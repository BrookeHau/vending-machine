import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VendingMachine {

	Collection<Coin> coins = new ArrayList<>();
	Collection<Inventory> inventories = new ArrayList<>();
	Collection<Product> products = new ArrayList<>();

	public VendingMachine() {
		Product chips = new Product("Chips", 0.50);
		Inventory chipInv = new Inventory(chips, 5);
		inventories.add(chipInv);
		Product cola = new Product("Cola", 1.00);
		Inventory colaInv = new Inventory(cola, 6);
		inventories.add(colaInv);
		Product candy = new Product("Candy", 0.65);
		Inventory candyInv = new Inventory(candy, 9);
		inventories.add(candyInv);
	}

	private double balance;

	public String display() {
		if (balance == 0) {
			return "INSERT COIN";
		}
		for (Product product : products) {
			if (balance < product.price()) {
				return "Price is " + product.price();
			}
			if (balance == product.price()) {
				return "Thank you, here's your " + product.name();
			} if(balance > product.price()) {
				return "Your change is " + (balance - product.price());
			}
		}

		return "You have " + balance;
	}

	public void addCoin(Coin... coins) {
		for (Coin coin : coins) {
			balance += coin.value();
		}
	}

	public double balance() {
		return balance;
	}

	public void selectProduct(Product product) {
		products.add(product);
	}

	public String getProductName() {
		for (Product product : products) {
			return product.name();
		}
		return null;

	}

	public double getProductPrice() {
		for (Product product : products) {
			return product.price();
		}
		return 0;
	}

}
