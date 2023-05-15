package lezione6.motocicletta;

public class Motocicletta {
	
	private int serbatoio;
	private int capacitaMax;
	private String marca;
	private String cilindrata;
	private boolean statoMotore;
	private boolean luci;
	private int velocita;
	private boolean frecciaDestra;
	private boolean frecciaSinistra;
	private int marcia;
	private int marciaMax;
	
	
	public int getSerbatoio() {
		return this.serbatoio;
	}
	public int getCapacitaMax() {
		return this.capacitaMax;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getCilindrata() {
		return this.cilindrata;
	}
	public boolean getStatoMotore() {
		return this.statoMotore;
	}
	public boolean getLuci() {
		return this.luci;
	}
	public int getVelocita() {
		return this.velocita;
	}
	public boolean getFrecciaDestra() {
		return this.frecciaDestra;
	}
	public boolean getFrecciaSinistra() {
		return this.frecciaSinistra;
	}
	public int getMarcia() {
		return this.marcia;
	}
	public int getMarciaMax() {
		return this.marciaMax;
	}

	
	public Motocicletta(String marca, String cilindrata, int capacitaMax, int marciaMax) {
		this.serbatoio=0;
		this.velocita=0;
		this.statoMotore=false;
		this.luci=false;
		this.frecciaDestra=false;
		this.frecciaSinistra=false;
		this.marca=marca;
		this.cilindrata=cilindrata;
		this.capacitaMax=capacitaMax;
		this.marciaMax=marciaMax;
	}
	
	
	public boolean rifornimento(int litri) {
		if(litri+this.serbatoio>this.capacitaMax) {
			return false;
		}else {
			this.serbatoio+=litri;
			return true;
		}
	}
	
	
	public void accendiMotore() {
		if(this.statoMotore) {
			System.out.println("Moto è gia accesa!");
		}
		if(this.serbatoio>0) {
			this.statoMotore=true;
		}
	}
	public void spegniMotore() {
		if(!this.statoMotore) {
			System.out.println("Moto è gia spenta!");
		}
		if(this.statoMotore){
			this.statoMotore=false;
		}
	}
	
	
	public void aumentaMarcia() {
		if(this.marcia<=this.marciaMax) {
			this.marcia++;
		}else {
			System.out.println("Non puoi superare la velocita massima!");
		}
	}
	public void diminuisciMarcia() {
		if(this.marcia>0) {
			this.marcia--;
		}else {
			System.out.println("Non puoi diminuire!");
		}
	}
	
	
	public void accelera(int incrementoVelocita) {
		if(this.statoMotore && this.marcia>0) {
			this.velocita+=incrementoVelocita;
		}else {
			System.out.println("Accendi il motore o aumenti la marcia!");
		}
	}
	public void frena(int diminuzioneVelocita) {
		if(this.velocita>0) {
			this.velocita-=diminuzioneVelocita;
		}else {
			System.out.println("Non puoi diminuire!");
		}
	}
	
	
	public void accendiLuci() {
		if(this.luci) {
			System.out.println("Luci gia accese");
		}else {
			this.luci=true;
		}
	}
	public void spegniLuci() {
		if(!this.luci) {
			System.out.println("Luci gia spente");
		}else {
			this.luci=false;
		}
	}
	
	
	public void accendiFrecciaDestra() {
		if(this.frecciaDestra) {
			System.out.println("Freccia destra gia accesa");
		}else {
			this.frecciaDestra=true;
		}
	}
	public void accendiFrecciaSinistra() {
		if(this.frecciaSinistra) {
			System.out.println("Freccia sinistra gia accesa");
		}else {
			this.frecciaSinistra=true;
		}
	}
	
	
	public void spegniFrecciaDestra() {
		if(!this.frecciaDestra) {
			System.out.println("Freccia destra gia spenta");
		}else {
			this.frecciaDestra=false;
		}
	}
	public void spegniFrecciaSinistra() {
		if(!this.frecciaSinistra) {
			System.out.println("Freccia sinistra gia spenta");
		}else {
			this.frecciaSinistra=false;
		}
	}
}
