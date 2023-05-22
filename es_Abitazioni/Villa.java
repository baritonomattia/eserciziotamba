package es_Abitazioni;

public class Villa extends Immobile{
    private int numeroPiani;
    private int superficieGiardino;
    private boolean piscina;

    public Villa(int numeroStanze, int superficie, String indirizzo, String citta, int numeroPiani, int superficieGiardino, boolean piscina) {
        super(numeroStanze, superficie, indirizzo, citta);
        this.numeroPiani = numeroPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public int getNumeroPiani() {
        return numeroPiani;
    }



    public boolean isPiscina() {
        return piscina;
    }


    public int getSuperficieGiardino() {
        return superficieGiardino;
    }



    public String toString(){
        return super.toString()+" Piani: "+ numeroPiani + " Superficie giardino:"+ superficieGiardino + "mq Piscina: "+((piscina)?"Si":"No");
    }

    public boolean equals(Villa villa){
        return ((super.equals(villa))&&
                (villa.getNumeroPiani()== numeroPiani)&&
                (villa.isPiscina()==piscina)&&
                (villa.getSuperficieGiardino()== superficieGiardino));
    }

}

