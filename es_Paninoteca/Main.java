package es_Paninoteca;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Paninoteca r = new Paninoteca();
        Scanner sca = new Scanner(System.in); 
        int scelta  = -1; 
        System.out.println("Benvenuto nel ristorante");
        do {
            System.out.println("1. Aggiungi ingredienti");
            System.out.println("2. Cancella ingredienti");
            System.out.println("3. Stampa ingredienti");
            System.out.println("4. Ordina panini ");
            System.out.println("0. Esci");   
            scelta = sca.nextInt(); 
            switch (scelta) {
            case 1:
                r.aggiungiIngrediente();
                break;
            case 2:
                r.cancellaIngrediente();
                break;
            case 3:
                r.visualizzaPanino();
                break;
            case 4: 
                r.ordinaPanino(); 
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
