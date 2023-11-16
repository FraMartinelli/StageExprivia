package es02;
/*Crea una funzione che accetta un array di numeri interi, somma separatamente i numeri pari e
 dispari, quindi restituisce la differenza tra la somma dei numeri pari e dispari*/
public class GuerraDiNumeri extends Somma{

	public static void main(String[] args) {
		//creazione Array numeri interi
		int[] numInteri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sommaPari = sommaNumPari(numInteri);
		int sommaDispari = sommaNumDispari(numInteri);
		int differenza = diffPariDispari(sommaPari, sommaDispari);
		
		System.out.println("La somma dei nuemri pari è " + sommaPari);
		System.out.println("La somma dei nuemri dispari è " + sommaDispari);
		System.out.println("La differenza tra i numeri pari e i dispari è " + differenza);
	}   
}


