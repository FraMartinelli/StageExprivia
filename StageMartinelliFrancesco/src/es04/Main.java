package es04;
/*Implementare in Java un ALBERO BINARIO.
Ciascun nodo deve poter contenere un valore di tipo STRING e un valore di tipo INTEGER.
Popolare l’albero binario con valori “a piacere” con almeno 12 nodi.
Creare dei metodi che permettano di:
Stampare le info SRING e INT di ciascun nodo (visita dell’albero binario)
Stampare le informazioni dei soli nodi foglia.
*/
public class Main {

	public static void main(String[] args) {
		AlberoBinario albero = new AlberoBinario();

        // Inserimento di almeno 12 nodi con valori a piacere
        albero.inserisci("A", 10);
        albero.inserisci("B", 5);
        albero.inserisci("C", 15);
        albero.inserisci("D", 3);
        albero.inserisci("E", 7);
        albero.inserisci("F", 12);
        albero.inserisci("G", 18);
        albero.inserisci("H", 1);
        albero.inserisci("I", 6);
        albero.inserisci("J", 9);
        albero.inserisci("K", 14);
        albero.inserisci("L", 8);

        // Stampa delle informazioni di tutti i nodi
        System.out.println("Informazioni di tutti i nodi:");
        albero.stampaInformazioniNodi();

        // Stampa delle informazioni dei nodi foglia
        System.out.println("\nInformazioni dei nodi foglia:");
        albero.stampaInformazioniNodiFoglia();


	}

}
