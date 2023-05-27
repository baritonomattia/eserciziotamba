package es_Paninoteca;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Paninoteca r = new Paninoteca();
        Scanner sca = new Scanner(System.in); 
        int scelta  = -1; 
        System.out.println("Benvenuto nel ristorante");
        do {
            System.out.println("1. Aggiungi panino");
            System.out.println("2. Stampa ingredienti");
            System.out.println("3. Ordina panini ");
            System.out.println("0. Esci");   
            scelta = sca.nextInt(); 
            switch (scelta) {
            case 1:
                r.aggiungiPanino();
                break;
            case 2:
                r.stampaPanini();
                break;
            case 3:
                r.ordinaPane();;
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
