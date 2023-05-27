package es_Paninoteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Paninoteca {
    ArrayList<Panino> panini;

    public Paninoteca() {
        panini = new ArrayList<Panino>();
    }

    public void aggiungiPanino() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Aggiungi panino");
        System.out.println("Tipo pane: ");
        String tipoPane = System.console().readLine();
        Panino panino = new Panino(tipoPane);
        
        int scelta = -1;
        do {
            System.out.println("1) Aggiungi ingrediente");
            System.out.println("2) Rimuovi ingrediente");
            System.out.println("0) Esci");
            scelta = scanner.nextInt(); 
            switch (scelta) {
                case 1:
                    System.out.println("Ingrediente: ");
                    String ingrediente = System.console().readLine();
                    panino.aggiungiIngrediente(ingrediente);
                    break;
                case 2:
                    System.out.println("Ingrediente: ");
                    ingrediente = System.console().readLine();
                    panino.rimuoviIngrediente(ingrediente);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 0);
        panini.add(panino);
      
    }

    public void stampaPanini() {
        System.out.println("Stampa panini");
        for (Panino panino : panini) {
            System.out.println(panino);
        }
    }
    public void ordinaPane() {
        System.out.println("Ordina per tipo pane");
        panini.sort((p1, p2) -> p1.getTipoPane().compareTo(p2.getTipoPane()));
        stampaPanini();
    }

}