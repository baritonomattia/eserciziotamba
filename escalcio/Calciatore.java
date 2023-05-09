package escalcio;

public class Calciatore {
    private String nome, cognome, ruolo; 
    private int numeromaglia;

    
    public Calciatore(String nome, String cognome, String ruolo, int numeromaglia) {
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
        this.numeromaglia = numeromaglia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getRuolo() {
        return ruolo;
    }
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    public int getNumeromaglia() {
        return numeromaglia;
    }
    public void setNumeromaglia(int numeromaglia) {
        this.numeromaglia = numeromaglia;
    }


    public String toString() {
        return "Calciatore [nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo + ", numeromaglia="
                + numeromaglia + "]";
    } 
}
