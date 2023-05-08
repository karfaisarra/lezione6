package lezione6;

import java.util.Scanner;

public class ProvaDipendente {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		String nome = scanner.next();
		
		System.out.println("Inserisci il tuo stipendio");
		double stipendio = scanner.nextDouble();
		scanner.close();
		Dipendente dipendente = new Dipendente(nome, stipendio);
		
		String ilNome= dipendente.getNome();
		System.out.println("Ciao " + ilNome);
		
		double loStipendio= dipendente.getStipendio();
		System.out.println("Stipendio attuale: " + loStipendio);
		
		double stipendioNuovo= dipendente.aumentaSalario(40);
		System.out.println("Stipendio aumentato: " + stipendioNuovo);
	}
}
