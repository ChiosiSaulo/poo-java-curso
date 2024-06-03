package execicioStaticFinal;

public class CurrencyConverter {
	public static double dollar;
	public static double qntDollar;
	public static final double IOF = 0.06;
	
	public static double calcReais() {
		return dollar * qntDollar * (1.0 + IOF);
	}
	
	
}
