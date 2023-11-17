package es05;

public class Inverter {
	public static int invertiNumero(int numero) {
        int numeroInvertito = 0;
	 while (numero != 0) {
         // Moltiplica il numeroInvertito per 10 e aggiungi l'ultima cifra di numero
         numeroInvertito = numeroInvertito * 10 + numero % 10;

         // Rimuovi l'ultima cifra da numero
         numero = numero / 10;
     }

     return numeroInvertito;
	
}
}

