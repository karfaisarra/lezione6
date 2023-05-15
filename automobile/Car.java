package lezione6.automobile;

public class Car {
	private double chilomertriPerLitro;
	private double carburante;
	
	public Car (double c) {
		chilomertriPerLitro=c;
		carburante=0;
	}
	public boolean drive(double distanzaInChilometro) {
		double carburantePerChilometri= distanzaInChilometro/chilomertriPerLitro;
		if(carburantePerChilometri<carburante*chilomertriPerLitro) {
			return false;
		}else {
			carburante=carburante - carburantePerChilometri;
			return true;
		}
	}
	public double getGas() {
		return carburante;
	}
	public void addGas(double c) {
		carburante+=c;
	}
}
