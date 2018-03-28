import java.util.Arrays;
import java.util.List;

public class VendingMachine {

	List<Coin> coins = Arrays.asList();
	private double balance;

	public String display() {
		return "INSERT COIN";
	}

	public void addCoin(Coin... coins) {
		for (Coin coin : coins) {
			balance += coin.value();
		}
	}

	public double balance() {
		return balance;
	}

}
