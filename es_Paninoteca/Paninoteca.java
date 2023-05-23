package es_Paninoteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Paninoteca {
    private ArrayList<Panino> panini = new ArrayList<>(); 

    public void aggiungiPanino() {
        System.out.println("Aggiungi panino");
        System.out.println("Tipo pane: ");
        String tipoPane = System.console().readLine();
        ArrayList<String> ingredienti = new ArrayList<String>();    
        Panino panino = new Panino(tipoPane, ingredienti);
        panini.add(panino);
        
    }

    
    public void visualizzaPanino(){
        for (Panino p : panini) {
            System.out.println(p);
        }
    }
}
