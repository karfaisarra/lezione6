package lezione6.motocicletta;

public class ProvaMotocicletta {
	public static void main(String args[]) {

		Motocicletta moto = new Motocicletta("Honda", "745", 16, 5);
		
		moto.spegniMotore();
		
		moto.rifornimento(9);
		System.out.println("Serbatoio: " + moto.getSerbatoio());
		
		moto.accendiMotore();
		//moto.accendiMotore();

		moto.aumentaMarcia();
		
		moto.accelera(20);
		System.out.println("Velocita: " + moto.getVelocita());
		
		moto.aumentaMarcia();
		System.out.println("Marcia: " + moto.getMarcia());
		
		moto.frena(5);
		System.out.println("Velocita: " + moto.getVelocita());
		
		moto.accendiFrecciaDestra();
		//moto.accendiFrecciaDestra();
		moto.spegniFrecciaDestra();
		//moto.spegniFrecciaDestra();
		
		moto.accendiFrecciaSinistra();
		//moto.accendiFrecciaSinistra();
		moto.spegniFrecciaSinistra();
		//moto.spegniFrecciaSinistra();
		
		moto.accendiLuci();
		//moto.accendiLuci();
		moto.spegniLuci();
		//moto.spegniLuci();
		
		moto.spegniMotore();
	}
}
