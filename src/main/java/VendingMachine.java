import java.util.Arrays;
import java.util.List;

public class VendingMachine {

	List<Coin> coins = Arrays.asList();
	private double balance = 0 ;

	public String display() {
		return "INSERT COIN";
	}

	public void addCoin(Coin type) {
		balance += type.value();
	}

	public double balance() {
		return balance;
	}

}
