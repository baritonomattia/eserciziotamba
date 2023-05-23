package es_Prenotazioni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ristorante {
    ArrayList<Prenotazione> a = new ArrayList<>();
    
    public void aggiungi(){
        Scanner s = new Scanner(System.in); 
        System.out.println("Inserisci nome:");
        String nome = System.console().readLine();
        System.out.println("Inserisci telefono:");
        String telefono = System.console().readLine();
        System.out.println("Inserisci numero persone:");
        int numPersone = Integer.parseInt(System.console().readLine());
        System.out.println("Inserisci numero tavolo:");
        int numTavolo = Integer.parseInt(System.console().readLine());
        System.out.println("inserisci data ");
        String data = System.console().readLine();
        System.out.println("inserisci orario ");
        String orario = System.console().readLine();
        Prenotazione p = new Prenotazione(nome, telefono, numPersone, numTavolo, data);
        
        a.add(p);

    }

    public void cancellaPrenotazione() {
        System.out.println("Inserisci nome:");
        String nome = System.console().readLine();
        Iterator<Prenotazione> it = a.iterator();
        while (it.hasNext()) {
            Prenotazione p = it.next();
            if (p.getNome().equals(nome)) {
                it.remove();
            }
        }
    
    }

    public void visualizzaPrenotazioni() {
        System.out.println("Inserisci nome:");
        String nome = System.console().readLine();
        for (Prenotazione p : a) {
            if (p.getNome().equals(nome)) {
                System.out.println(p);
            }
        }
    }
    public void cercaTavolo() {
        System.out.println("Inserisci numero tavolo:");
        int numTavolo = Integer.parseInt(System.console().readLine());
        for (Prenotazione p : a) {
            if (p.getNumTavolo() == numTavolo) {
                System.out.println(p);
            }
        }
       
    }

    
    public void ordinaPrenotazioni() {
        a.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
    
        for (Prenotazione p : a) {
            System.out.println(p);
        }
    }
}
