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
		/*double bal = vm.balance();*/
		String bal = vm.display();
		assertThat(bal, is("You have 0.25"));
	}

	@Test
	public void displayTenForDime() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.004, 0.5);
		vm.addCoin(coin);
	/*	double result = vm.balance();*/
		String result = vm.display();
		assertThat(result, is("You have 0.1"));
	}

	@Test
	public void displayTenForNickel() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.005, 1);
		vm.addCoin(coin);
		/*double result = vm.balance();*/
		String result = vm.display();
		assertThat(result, is("You have 0.05"));
	}

	@Test
	public void valueForMultipleCoins() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.005, 1);
		Coin coin2 = new Coin(.006, 1.5);
		vm.addCoin(coin, coin2);
		/*double result = vm.balance();*/
		String result = vm.display();
		assertThat(result, is("You have 0.3"));
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

	@Test
	public void addProductToVendingOrder() {
		Product product = new Product("Chips", 1.50);
		VendingMachine vm = new VendingMachine();
		vm.selectProduct(product);
		String check = vm.getProductName();
		assertThat(check, is("Chips"));
	}

	@Test
	public void getProductPrice() {
		Product product = new Product("Chips", 1.50);
		VendingMachine vm = new VendingMachine();
		vm.selectProduct(product);
		double check = vm.getProductPrice();
		assertThat(check, is(1.50));
	}
	
	@Test
	public void tryToBuyProductWithLessCoins() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.006, 1.5);
		Coin coin2 = new Coin(.004, 0.5);
		vm.addCoin(coin, coin, coin, coin, coin);
		Product chips = new Product("Chips", 1.50);
		vm.selectProduct(chips);
		String result = vm.display();
		assertThat(result, is("Price is 1.5"));	
	}
	
	@Test
	public void tryToBuyProductWithExactChange() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.006, 1.5);
		Coin coin2 = new Coin(.004, 0.5);
		vm.addCoin(coin, coin, coin, coin, coin, coin);
		Product chips = new Product("Chips", 1.50);
		vm.selectProduct(chips);
		String result = vm.display();
		assertThat(result, is("Thank you, here's your Chips"));	
	}
	
	@Test
	public void buyProductWithTooManyCoins() {
		VendingMachine vm = new VendingMachine();
		Coin coin = new Coin(.006, 1.5);
		Coin coin2 = new Coin(.004, 0.5);
		vm.addCoin(coin, coin, coin, coin, coin, coin, coin);
		Product chips = new Product("Chips", 1.50);
		vm.selectProduct(chips);
		String result = vm.display();
		assertThat(result, is("Your change is 0.25"));	
	}

}
