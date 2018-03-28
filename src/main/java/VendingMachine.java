import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VendingMachine {

	Collection<Coin> coins = new ArrayList<>();
	Collection<Product> products = new ArrayList<>();
	
	
	private double balance;

	public String display() {
		return "INSERT COIN";
	}

	public void addCoin(Coin... coins) {
		for (Coin coin : coins) {
			balance += coin.value();
		}
	}

	public double balance() {
		return balance;
	}
	

	public void addProduct(Product product) {
		products.add(product);
	}

	public String getProductName() {
		for(Product product: products) {
			return product.name();
		}
		return null;
		
	}

	public double getProductPrice() {
		for(Product product: products) {
			return product.price();
		}
		return 0 ;
	}

}
