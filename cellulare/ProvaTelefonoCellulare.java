package lezione6.cellulare;

public class ProvaTelefonoCellulare {
	public static void main(String args[]) {
		TelefonoCellulare cellulare = new TelefonoCellulare("Samsung", "Modello s20", 0.2, "VerryMobile");
		
		cellulare.accendi();
		//cellulare.spegni();
		cellulare.telefona(20);
		System.out.println(cellulare.getNumeroTelefonate());
		System.out.println(cellulare.getSecondiConversazione());
		System.out.println(cellulare.getCostoTelefonate()+"$");
		System.out.println(cellulare.getCostoPerSecondo()+"$");
		System.out.println(cellulare.getOperatore());
		
		cellulare.cambioOperatore("Orange", 0.10);
		System.out.println(cellulare.getCostoPerSecondo()+"$");
		System.out.println(cellulare.getOperatore());
		System.out.println(cellulare.getCostoTelefonate());
		
		cellulare.telefona(20);
		System.out.println(cellulare.getNumeroTelefonate());
		System.out.println(cellulare.getSecondiConversazione());
		System.out.println(cellulare.getCostoTelefonate()+"$");
		System.out.println(cellulare.getCostoPerSecondo()+"$");
		System.out.println(cellulare.getOperatore());
	}
	
}
