package es_Prenotazioni;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Ristorante r = new Ristorante();
        Scanner sca = new Scanner(System.in); 
        int scelta  = -1; 
        System.out.println("Benvenuto nel ristorante");
        do {
            System.out.println("1. Aggiungi prenotazione");
            System.out.println("2. Cancella prenotazione");
            System.out.println("3. Stampa prenotazioni");
            System.out.println("4. Cerca tavolo");
            System.out.println("5. Ordina prenotazioni");
            System.out.println("0. Esci");
            
            scelta = sca.nextInt(); 
            switch (scelta) {
            case 1:
                r.aggiungi();
                break;
            case 2:
                r.cancellaPrenotazione();
                break;
            case 3:
                r.visualizzaPrenotazioni();
                break;
            case 4:
                r.cercaTavolo();
                break;
            case 5:
                r.ordinaPrenotazioni();
                break;
            case 0:
                System.out.println("Arrivederci");
                break;
            default:
                System.out.println("Scelta non valida");
            }
        } while(scelta != 0); 
    }
}