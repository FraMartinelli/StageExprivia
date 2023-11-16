package es01;
import java.util.Arrays;
/*Crea una funzione che accetta due numeri come argomenti (num, lunghezza) e restituisce un 
 array di multipli di num finché la lunghezza dell'array non raggiunge la lunghezza.*/

public class arrayDiMultipli extends risultato{

	public static void main(String[] args) {
		//inserimento degli argomenti
		int num = 3;
		int lunghezza = 10;
		
		int[] risultato = generaMultipli(num , lunghezza);
		System.out.println(Arrays.toString(risultato));
		
	}
}
