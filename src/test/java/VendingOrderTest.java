import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VendingOrderTest {

	@Test
	public void createVendingOrder() {
		VendingOrder vo = new VendingOrder();
	}
	
	@Test
	public void addProductToOrderAndGetPrice() {
		Product product = new Product("Chips", 1.50);
		VendingOrder vo = new VendingOrder();
		vo.addProduct(product);
		double orderPrice = vo.orderPrice();
		assertThat(orderPrice, is(1.50));	
	}
	
	@Test
	public void addProductToOrderAndGetName() {
		Product product = new Product("Chips", 1.50);
		VendingOrder vo = new VendingOrder();
		vo.addProduct(product);
		String name = vo.orderProductName();
		assertThat(name, is("Chips"));	
	}
}
