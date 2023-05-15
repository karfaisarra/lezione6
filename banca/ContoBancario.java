package lezione6.banca;

public class ContoBancario {
	private String numeroContoCorrente;
	private int bilancioContoCorrente;
	
	public ContoBancario(String numero) {
		numeroContoCorrente=numero;
		bilancioContoCorrente=0;
	}
	public ContoBancario(String numero, int bilancio) {
		numeroContoCorrente=numero;
		bilancioContoCorrente=bilancio;
	}
	
	public void deposita(int ammontare) {
		bilancioContoCorrente+=ammontare;
	}
	
	public boolean preleva(int ammontare) {
		if(ammontare>bilancioContoCorrente) {
			return false;
		}else {
			bilancioContoCorrente = bilancioContoCorrente - ammontare;
			return true;
		}
	}
	
	public String getConto() {
		return numeroContoCorrente;
	}
	
	public int getBilancio() {
		return bilancioContoCorrente;
	}
}
