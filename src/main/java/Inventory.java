import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private int inventoryQty;
	private Product product;

	public Inventory(Product product, int inventoryQty) {
		this.product = product;
		this.inventoryQty = inventoryQty;
	}

	public int quantity() {
		return inventoryQty;
	}

	public String productName() {
		return product.name();
	}

	public double productPrice() {
		return product.price();
	}

	public Object getProduct() {
		return product;
	}

}
