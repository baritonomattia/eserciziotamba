package es_Abitazioni;

abstract public class Immobile {
    private int numeroStanze;
    private int superficie;
    private String indirizzo;
    private String citta;

    public Immobile(int numeroStanze, int superficie, String indirizzo, String citta) {
        this.numeroStanze = numeroStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public String getCitta() {
        return citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public int getSuperficie() {
        return superficie;
    }

    public String toString(){
        return " Indirizzo: "+indirizzo+" Città: "+citta+ " Numero Stanze: "+ numeroStanze +" Superficie:"+superficie;
    }

    public Boolean equals(Immobile immobile){
        return ((immobile.getSuperficie()==superficie)&&
                (immobile.getNumeroStanze()== numeroStanze)&&
                (immobile.getIndirizzo().equals(indirizzo))&&
                (immobile.getCitta().equals(citta)));
    }
}

