import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProductTest {

	@Test
	public void productName() {
		Product product = new Product("name", 1.30);
		String check = product.name();
		assertThat(check, is("name"));
	}
	
	@Test
	public void productPrice() {
		Product product = new Product("name", 1.30);
		double check = product.price();
		assertThat(check, is(1.30));
	}
	
}
