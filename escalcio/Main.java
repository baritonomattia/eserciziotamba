package escalcio ;

import java.util.Scanner;
public class Main {

    public static void Main(String[] args) {
        Squadra a = new Squadra();
        Scanner input = new Scanner(System.in);
        while (true) {
            
            System.out.println("1. Inserimento calciatore");
            System.out.println("2. Calcolo goal segnati per ruolo");
            System.out.println("3. Uscita");
            int scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    a.aggiungi();
                    break;
                case 2:
                    a.aggiungiGoal();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida");
            }
        }
    }
}

