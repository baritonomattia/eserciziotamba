package es_Paninoteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Panino {
    private String tipoPane;
    private ArrayList<String> ingredienti;
    
    public String getTipoPane() {
        return tipoPane;
    }
    public Panino(String tipoPane, ArrayList<String> ingredienti) {
        this.tipoPane = tipoPane;
        this.ingredienti = ingredienti;
    }
    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }
    // aggiungi ingrediente
    public void aggiungiIngrediente(String ingrediente) {
        ingredienti.add(ingrediente);
    }
    // rimuovi ingrediente
    public void rimuoviIngrediente(String ingrediente) {
        ingredienti.remove(ingrediente);
    }
    @Override
    public String toString() {
        return "Panino [tipoPane=" + tipoPane + ", ingredienti=" + ingredienti + "]";
    }
}