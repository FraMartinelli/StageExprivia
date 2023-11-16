package es02;

public class Somma extends diffPariDispari{
	//funzione somma numeri pari
	public static int sommaNumPari(int[] numInteri) {
		int somma = 0;
		
		for (int numero : numInteri) {
            if (numero % 2 == 0) {
                somma += numero;
            }
		}
		return somma;
	}
	//funzione numeri dispari
	public static int sommaNumDispari(int[] numInteri) {
		int somma = 0;
		
		for (int numero : numInteri) {
            if (numero % 2 == 1) {
                somma += numero;
            	}
		}
		return somma;
    }


}
