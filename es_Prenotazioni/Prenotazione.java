package es_Prenotazioni;

public class Prenotazione {
    private String nome, telefono;
    private int numPersone, numTavolo;
    private String data;
    
    public Prenotazione(String nome, String telefono, int numPersone, int numTavolo, String data) {
        this.nome = nome;
        this.telefono = telefono;
        this.numPersone = numPersone;
        this.numTavolo = numTavolo;
        this.data = data;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getNumPersone() {
        return numPersone;
    }
    public int getNumTavolo() {
        return numTavolo;
    }
    public String getData() {
        return data;
    }
    @Override
    public String toString() {
        return "Prenotazione [nome=" + nome + ", telefono=" + telefono + ", numPersone=" + numPersone + ", numTavolo="
                + numTavolo + ", data=" + data + "]";
    }
    
}