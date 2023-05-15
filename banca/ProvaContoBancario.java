package lezione6.banca;

public class ProvaContoBancario {
	public static void main(String args[]) {
		ContoBancario conto = new ContoBancario("1010101010", 1500);
		
		conto.deposita(1000);
		
		boolean transizione = conto.preleva(700);
		System.out.println(transizione);
		System.out.println(conto.getBilancio());
	}
}
