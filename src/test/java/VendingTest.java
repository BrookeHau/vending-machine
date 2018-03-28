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
		vm.addCoin(coin);
		double bal = vm.balance();
		assertThat(bal, is(0.25));
	}
	
	@Test 
	public void displayTenForDime() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.004, 0.5);
		vm.addCoin(coin);
		double result = vm.balance();
		assertThat(result, is(0.10));
	}
	
	@Test 
	public void displayTenForNickel() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.005, 1);
		vm.addCoin(coin);
		double result = vm.balance();
		assertThat(result, is(0.05));
	}
	
	@Test
	public void valueForMultipleCoins() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.005, 1);
		Coin coin2 = new Coin(.006, 1.5);
		vm.addCoin(coin, coin2);
		double result = vm.balance();
		assertThat(result, is(0.30));	
	}
	
	@Test
	public void addMoreCoins() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.005, 1);
		Coin coin2 = new Coin(.006, 1.5);
		Coin coin3 = new Coin(.006, 1.5);
		vm.addCoin(coin, coin2, coin3);
		double result = vm.balance();
		assertThat(result, is(0.55));	
	}
	
	@Test 
	public void shouldDisplayZero() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.003, 1.5);
		vm.addCoin(coin);
		double bal = vm.balance();
		assertThat(bal, is(0.0));
	}
}
