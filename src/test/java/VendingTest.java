import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VendingTest {

	@Test
	public void knowACoinIsADime() {
		Coin coin = new Coin(.004, 0.5);
		String type = coin.type();
		assertThat(type, is("Dime"));
		
	}
	
	@Test
	public void knowACoinIsANickel() {
		Coin coin = new Coin(.005, 1);
		String type = coin.type();
		assertThat(type, is("Nickel"));
		
	}
	
	@Test
	public void knowACoinIsAQuarter() {
		Coin coin = new Coin(.006, 1.5);
		String type = coin.type();
		assertThat(type, is("Quarter"));	
	}
	
	@Test
	public void knowACoinIsAPenny() {
		Coin coin = new Coin(.0005, 0.7);
		String type = coin.type();
		assertThat(type, is("Invalid Coin, check coin return"));	
	}
	
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
		String type = coin.type();
		vm.addCoin(type);
		double result = vm.balance();
		assertThat(result, is(0.25));
	}
	
	@Test 
	public void displayTenForDime() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.004, 0.5);
		String type = coin.type();
		vm.addCoin(type);
		double result = vm.balance();
		assertThat(result, is(0.10));
	}
}
