package lab05;

public class Currency {
	//attribute 
	public double Rate;
	//method
	public double convertToUSD(double thb) {
		return thb/Rate;
	}
	public double convertToTHB(double usd) {
		return usd*Rate;
	}
}

