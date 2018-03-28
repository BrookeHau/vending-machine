
public class Coin {

	private double weight;
	private double diameter;

	public Coin(double weight, double diameter) {
		this.weight = weight;
		this.diameter = diameter;

	}
	

	public String type() {
		if(weight == .005 && diameter == 1) {
			return "Nickel";
		} if(weight == .004 && diameter == 0.5) {
		return "Dime";
		} if(weight == .006 && diameter == 1.5) {
			return "Quarter";
		}
		return "Invalid Coin, check coin return";
	}

}
