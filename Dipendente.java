package lezione6;

public class Dipendente {
	private String nome;
	private double stipendio;
	
	public Dipendente() {
		
	}
	
	public Dipendente(String n, double s) {
		nome=n;
		stipendio=s;
	}
	public String getNome() {
		return nome;
	}
	public double getStipendio() {
		return stipendio;
	}
	public double aumentaSalario(double p) {
		double aumento =stipendio * (p/100);
		return stipendio+aumento;
	}
}
