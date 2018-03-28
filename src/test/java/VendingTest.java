import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VendingTest {

	@Test
	public void displayInsertCoin() {
		VendingMachine vm = new VendingMachine();
		String result = vm.display();
		assertThat(result, is("INSERT COIN"));
	}
	
	@Test
	public void knowACoinIsAPenny() {
		Coin coin = new Coin(.005, 1);
		String type = coin.type();
		assertThat(type, is("Nickel"));
		
	}
}
