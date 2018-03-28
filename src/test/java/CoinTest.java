import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CoinTest {

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
	public void getValueOfQuarter() {
		Coin coin = new Coin(.006, 1.5);
		double result = coin.value();
		assertThat(result, is(0.25));	
	}
	
	@Test
	public void getValueOfDime() {
		Coin coin = new Coin(.004, 0.5);
		double result = coin.value();
		assertThat(result, is(0.10));	
	}
	
	@Test
	public void getValueOfNickel() {
		Coin coin = new Coin(.005, 1);
		double result = coin.value();
		assertThat(result, is(0.05));	
	}
	
}
