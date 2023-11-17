package es06;

import java.util.Scanner;

/*Scrivi una funzione che prenda in input carburante (litri), uso del carburante(litri/100km),
 passeggeri, aria Condizionata (booleano) e restituisca la distanza massima che l'auto può percorrere. 
carburante è il numero di litri di carburante nel serbatoio. 
uso del carburante è il consumo base di carburante ogni 100 km (solo con il conducente a bordo). 
Ogni passeggero in più aumenta il consumo base di carburante del 5%. 
Se il condizionatore d'aria è acceso, il consumo di carburante totale (non di base) aumenterà del 10%. */
public class Main extends CalcoloDistanzaMassima{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double carburante;
		int passeggeri;
		boolean aria;
		double usoCarburante;
		 do {
	            // Chiedere all'utente di inserire il carburante
	            System.out.print("Inserisci la quantità di carburante (in litri): ");
	            carburante = scanner.nextDouble();
	            //Uso del carburante
	            System.out.print("Inserisci l'uso del carburante (litri/100km): ");
	            usoCarburante = scanner.nextDouble();
	            // Chiedere all'utente di inserire il numero di passeggeri
	            System.out.print("Inserisci il numero di passeggeri: ");
	            passeggeri = scanner.nextInt();
	            // Chiedere all'utente se l'aria condizionata è accesa
	            System.out.print("L'aria condizionata è accesa? (true/false): ");
	            aria = scanner.nextBoolean();
	         // Verificare se le condizioni sono soddisfatte
	            if (!condizioniInputValide(carburante, usoCarburante, passeggeri)) {
	                System.out.println("Valori inseriti non validi. Assicurati che il carburante sia maggiore di 1 e il numero di passeggeri sia maggiore o uguale a 0.");
	            }
	        } while (!condizioniInputValide(carburante, usoCarburante, passeggeri));
	        // Calcolare la distanza massima utilizzando la funzione
	        double distanzaMassima = calcolaDistanzaMassima(carburante, usoCarburante, passeggeri, aria);

	        // Stampare il risultato
	        System.out.println("Distanza massima(" + carburante + ", " + usoCarburante + ", " + passeggeri + ", " + aria + "): " + distanzaMassima + " km");
	};

}
