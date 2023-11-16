package es03;

import java.util.Scanner;

/*Crea una funzione che verificherà se una stringa è un PIN valido o meno tramite un'espressione regolare.
Un PIN valido ha:
Esattamente 4 o 6 caratteri.
Solo caratteri numerici (0-9).
Nessuno spazio bianco.*/
public class verificaPin extends validPin{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputPin;
		
		do {
			System.out.println("Inserire il pin: ");
			inputPin = scanner.next();
		
		if(validPin(inputPin)) {
			System.out.println("Il pin è valido");
		}
			else {
				System.out.println("Il pin non è valido assicurati che contenga 4 o 6 valori numerici.");
			}
		} while (!validPin(inputPin));
	}
}

