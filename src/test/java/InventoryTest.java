import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class InventoryTest {

	@Test
	public void createInventory() {
		Product product = new Product("Chips", 1.40);
		Inventory inventory = new Inventory(product, 2);
		int check = inventory.quantity();
		assertThat(check, is(2));		
	}
	
	@Test
	public void getProductName() {
		Product product = new Product("Chips", 1.40);
		Inventory inventory = new Inventory(product, 2);
		String check = inventory.productName();
		assertThat(check, is("Chips"));
	}
	
	@Test
	public void getProductPrice() {
		Product product = new Product("Chips", 1.40);
		Inventory inventory = new Inventory(product, 2);
		double check = inventory.productPrice();
		assertThat(check, is(1.40));
	}
	
	@Test
	public void getProduct() {
		Product product = new Product("Chips", 1.40);
		Inventory inventory = new Inventory(product, 2);
		assertThat(inventory.getProduct(), is(product));
	}
}
