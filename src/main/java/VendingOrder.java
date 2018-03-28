import java.util.ArrayList;
import java.util.Collection;

public class VendingOrder {

	Collection<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}

	public double orderPrice() {
		for(Product product: products) {
			return product.price();
		}
		return 0;
	}

	public String orderProductName() {
		for(Product product: products) {
			return product.name();
		}
		return "";
	}

}
