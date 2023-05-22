package es_Abitazioni;

public class Appartamento extends Immobile{
    private int piano;
    private int numeroTerrazzi;
    private boolean ascensore;
    private String interno;

    public Appartamento(int numeroStanze, int superficie, String indirizzo, String citta, int piano, String interno, int numeroTerrazzi, boolean ascensore) {
        super(numeroStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.interno=interno;
        this.numeroTerrazzi = numeroTerrazzi;
        this.ascensore = ascensore;
    }

    public boolean isAscensore() {
        return ascensore;
    }

    public String getInterno() {
        return interno;
    }


    public String toString(){
        return super.toString()+" Piano: "+piano+ " Numero terrazzi:"+ numeroTerrazzi + " Ascensore: "+((ascensore)?"Si":"No");
    }

}

    
