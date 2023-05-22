package es_Abitazioni;

public class Main {
    public static void main (String[] args){

        Abitazione a1 = new Abitazione(5, 80, "Via Galileo 30","Roma");
        Abitazione a2 = new Abitazione(5, 80, "Via Raffaelli 86","Firenze");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println("\nGli appartamenti\n" + a1.toString()+ " e \n"+ a2.toString()+"\n"+((a1.equals(a2)?"":" Non"))+" Coincidono");

        Appartamento ap1 = new Appartamento(5, 80, "Via Italico 99","Torino",3,"A32",4,false);
        Appartamento ap2 = new Appartamento(5, 80, "Via Corsica 46","Catania",3,"A34",4,true);
        System.out.println(ap1.toString());
        System.out.println(ap2.toString());

        Villa v1 = new Villa(10, 280, "Via Malafresca 18","Trieste",2,3000,false);
        Villa v2 = new Villa(15, 300, "Via de Marchi 23 ","Milano",2,2500,true);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println("\nLe ville\n" + v1.toString()+ " e \n"+ v2.toString()+"\n"+((v1.equals(v2)?"":" Non"))+" Coincidono");
    }
}