import static org.hamcrest.Matchers.contains;
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
	public void displayTwentyFiveForQuarter() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.006, 1.5);
		double bal = vm.balance();
		assertThat(bal, is(0.25));
	}
	
	/*@Test 
	public void displayTenForDime() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.004, 0.5);
		vm.addCoin(coin);
		double result = vm.balance();
		assertThat(result, is(0.10));
	}*/
}
