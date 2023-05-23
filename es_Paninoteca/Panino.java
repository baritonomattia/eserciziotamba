package es_Paninoteca;

import java.util.ArrayList;

public class Panino {
    private String tipoPane;
    private ArrayList<String> ingredienti;

    public String getTipoPane() {
        return tipoPane;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public void aggiungiIngrediente(String ingrediente) {
        ingredienti.add(ingrediente);
    }

    public void rimuoviIngrediente(String ingrediente) {
        ingredienti.remove(ingrediente);
    }


    public String toString() {
        return "Panino [tipoPane=" + tipoPane + ", ingredienti=" + ingredienti + "]";
    }
    
}
