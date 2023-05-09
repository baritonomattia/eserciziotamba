package escalcio;

import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Squadra {
    private ArrayList<Calciatore> Squadra = new ArrayList<>();
    private int goald = 0, goalc = 0, goala = 0; 

    public Squadra(){
        ArrayList<Calciatore> Squadra = new ArrayList<>();
    }

    public void aggiungi(){
        Scanner scanner = new Scanner(System.in); 
        try{
            System.out.println("inserisci ruolo ");
            System.out.println("difensori / centrocampisti / attaccanti ");
            String ruolo = scanner.nextLine(); 
            if(ruolo == "difensori"){
                System.out.println("scegli nome "); 
                String nome = scanner.nextLine(); 
                System.out.println("inserisci cognome");
                String cognome = scanner.nextLine(); 
                System.out.println("scegli un numero da 1 a 3");
                int n = scanner.nextInt();
                Calciatore a = new Calciatore(nome, cognome, ruolo, n);
                Squadra.add(a); 
            
            }else if(ruolo == "centrocampisti"){
                System.out.println("scegli nome "); 
                String nome = scanner.nextLine(); 
                System.out.println("inserisci cognome");
                String cognome = scanner.nextLine(); 
                System.out.println("scegli un numero da 4 a 6");
                int n = scanner.nextInt();
                Calciatore a = new Calciatore(nome, cognome, ruolo, n);
                Squadra.add(a); 

            }else if(ruolo == "attaccanti"){
                System.out.println("scegli nome "); 
                String nome = scanner.nextLine(); 
                System.out.println("inserisci cognome");
                String cognome = scanner.nextLine(); 
                System.out.println("scegli un numero da 7 a 11");
                int n = scanner.nextInt();
                Calciatore a = new Calciatore(nome, cognome, ruolo, n);
                Squadra.add(a); 
                
            }
        }catch(InputMismatchException e) {
            System.out.println("errore"); 
        }
    }

    public void aggiungiGoal(){
        Scanner scanner = new Scanner(System.in); 
        try{
            System.out.println("chi ha segnato, difensore / centrocampista / attccante ");
            String ruolo = scanner.nextLine(); 
            //int goald = 0, goalc = 0, goala = 0; 
            if(ruolo == "difensore ") goald ++; 
            else if (ruolo == "centrocampista") goalc++; 
            else if (ruolo == "attaccante ") goala++;
            System.out.println("goal dif = " + goald);
            System.out.println("goal cen = " + goalc);
            System.out.println("goal att = " + goala);   
        }catch(InputMismatchException e) {
            System.out.println("errore ");
        }
    }

    
}
