package es01;

public class risultato {
	public static int[] generaMultipli(int num, int lunghezza) {
        int[] multipliArray = new int[lunghezza];
        
        for (int i = 0; i < lunghezza; i++) {
            multipliArray[i] = num * (i + 1); // Calcola il multiplo e lo aggiunge all'array
        }

        return multipliArray;
}

}
