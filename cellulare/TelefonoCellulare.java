package lezione6.cellulare;

public class TelefonoCellulare {
	private int secondiConversazione;
	private int numeroTelefonate;
	private double costoTelefonate;
	private double costoPerSecondo;
	private String stato="spento";
	private String marca;
	private String modello;
	private String operatore;
	
	public TelefonoCellulare() {
		
	}
	public TelefonoCellulare(String marca, String modello, double costoPerSecondo, String operatore) {
		this.marca=marca;
		this.modello=modello;
		this.costoPerSecondo=costoPerSecondo;
		this.operatore=operatore;
	}
	public void accendi () {
		this.stato="acceso";
	}
	public void spegni () {
		this.stato="spento";
	}
	public void telefona(int secondi) {
		if(this.stato.equalsIgnoreCase("acceso")) {
			this.secondiConversazione += secondi;
			this.numeroTelefonate += 1;
			this.costoTelefonate += this.costoPerSecondo*secondi;
		}
	}
	public int getSecondiConversazione() {
		return this.secondiConversazione;
	}
	public int getNumeroTelefonate() {
		return this.numeroTelefonate;
	}
	public double getCostoTelefonate() {
		return costoTelefonate;
	}
	public double getCostoPerSecondo() {
		return costoPerSecondo;
	}
	public String getStato() {
		return stato;
	}
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public String getOperatore() {
		return operatore;
	}
	public void cambioOperatore(String operatore, double costoPerSecondo) {
		this.operatore=operatore;
		this.costoPerSecondo=costoPerSecondo;
		this.costoTelefonate=0;
	}
}
