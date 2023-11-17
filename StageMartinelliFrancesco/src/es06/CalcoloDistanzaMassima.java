package es06;

public class CalcoloDistanzaMassima {
	public static boolean condizioniInputValide(double carburante, double usoCarburante, int passeggeri) {
        return carburante > 1.0 && usoCarburante > 1.0 && passeggeri >= 0;
	}
	public static double calcolaDistanzaMassima(double carburante, double usoCarburante, int passeggeri, boolean aria) {
		// Fattore di correzione per il carico dei passeggeri
        double fattoreCaricoPasseggeri = 1 + (passeggeri * 0.05);

        // Fattore di correzione per l'aria condizionata
        double fattoreAria = aria ? 0.9 : 1.0;

        // Calcolo della distanza massima
        double distanzaMassima = (carburante / (usoCarburante * fattoreCaricoPasseggeri * fattoreAria)) * 100;

        return distanzaMassima;
	}

}
