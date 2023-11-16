package es04;

public class AlberoBinario extends nodoAlbero{
	
	    NodoAlbero radice;

	    public AlberoBinario() {
	        this.radice = null;
	    }

	    public void inserisci(String valoreStringa, Integer valoreIntero) {
	        radice = inserisciRicorsivo(radice, valoreStringa, valoreIntero);
	    }

	    private NodoAlbero inserisciRicorsivo(NodoAlbero radice, String valoreStringa, Integer valoreIntero) {
	        if (radice == null) {
	            return new NodoAlbero(valoreStringa, valoreIntero);
	        }

	        if (valoreIntero < radice.valoreIntero) {
	            radice.figlioSx = inserisciRicorsivo(radice.figlioSx, valoreStringa, valoreIntero);
	        } else if (valoreIntero > radice.valoreIntero) {
	            radice.figlioDx = inserisciRicorsivo(radice.figlioDx, valoreStringa, valoreIntero);
	        }

	        return radice;
	    }

	    public void stampaInformazioniNodi() {
	        stampaInformazioniNodi(radice);
	    }

	    private void stampaInformazioniNodi(NodoAlbero nodo) {
	        if (nodo != null) {
	            System.out.println("Valore Stringa: " + nodo.valoreStringa + ", Valore Intero: " + nodo.valoreIntero);
	            stampaInformazioniNodi(nodo.figlioSx);
	            stampaInformazioniNodi(nodo.figlioDx);
	        }
	    }

	    public void stampaInformazioniNodiFoglia() {
	        stampaInformazioniNodiFoglia(radice);
	    }

	    private void stampaInformazioniNodiFoglia(NodoAlbero nodo) {
	        if (nodo != null) {
	            if (nodo.figlioSx == null && nodo.figlioDx == null) {
	                System.out.println("Valore Stringa: " + nodo.valoreStringa + ", Valore Intero: " + nodo.valoreIntero);
	            }
	            stampaInformazioniNodiFoglia(nodo.figlioSx);
	            stampaInformazioniNodiFoglia(nodo.figlioDx);
	        }
	    }
	}



