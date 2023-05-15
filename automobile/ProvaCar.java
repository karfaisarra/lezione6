package lezione6.automobile;

public class ProvaCar {
	public static void main(String args[]) {
		Car myCar = new Car(4);
		myCar.addGas(16);
		boolean resultato = myCar.drive(120);
		System.out.println(resultato);
		System.out.println(myCar.getGas());
	}
}
