package es05;

import java.util.Scanner;

//Crea una funzione che prende un numero intero n e lo inverte. 
public class Main extends Inverter{
	public static void main (String [] argv){
		        //numero dato in input da console da invertire
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci il numero da invertire: ");
        int numero = scanner.nextInt();
        //trasfromazione del numero qual'ora fosse negativo in positivo
        numero = Math.abs(numero);
		// Numero da invertire
		      //  int numero = 123;

		        // Chiamata alla funzione per invertire il numero
		        int numeroInvertito = invertiNumero(numero);

		        // Stampare il risultato
		        System.out.println("Numero originale: " + numero);
		        System.out.println("Numero invertito: " + numeroInvertito);
	}
}


	