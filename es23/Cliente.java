package es23;

public class Cliente {
    private String codiceCliente, cognomeCliente, nomeCliente, indirizzoCliente, cittaCliente, dataTelefonata, OraTelefonata, codiceDipendente, CognomeDipendente, nomeDipendente;

    public Cliente(String codiceCliente, String cognomeCliente, String nomeCliente, String indirizzoCliente,
            String cittaCliente, String dataTelefonata, String oraTelefonata, String codiceDipendente,
            String cognomeDipendente, String nomeDipendente) {
        this.codiceCliente = codiceCliente;
        this.cognomeCliente = cognomeCliente;
        this.nomeCliente = nomeCliente;
        this.indirizzoCliente = indirizzoCliente;
        this.cittaCliente = cittaCliente;
        this.dataTelefonata = dataTelefonata;
        OraTelefonata = oraTelefonata;
        this.codiceDipendente = codiceDipendente;
        CognomeDipendente = cognomeDipendente;
        this.nomeDipendente = nomeDipendente;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getIndirizzoCliente() {
        return indirizzoCliente;
    }

    public void setIndirizzoCliente(String indirizzoCliente) {
        this.indirizzoCliente = indirizzoCliente;
    }

    public String getCittaCliente() {
        return cittaCliente;
    }

    public void setCittaCliente(String cittaCliente) {
        this.cittaCliente = cittaCliente;
    }

    public String getDataTelefonata() {
        return dataTelefonata;
    }

    public void setDataTelefonata(String dataTelefonata) {
        this.dataTelefonata = dataTelefonata;
    }

    public String getOraTelefonata() {
        return OraTelefonata;
    }

    public void setOraTelefonata(String oraTelefonata) {
        OraTelefonata = oraTelefonata;
    }

    public String getCodiceDipendente() {
        return codiceDipendente;
    }

    public void setCodiceDipendente(String codiceDipendente) {
        this.codiceDipendente = codiceDipendente;
    }

    public String getCognomeDipendente() {
        return CognomeDipendente;
    }

    public void setCognomeDipendente(String cognomeDipendente) {
        CognomeDipendente = cognomeDipendente;
    }

    public String getNomeDipendente() {
        return nomeDipendente;
    }

    public void setNomeDipendente(String nomeDipendente) {
        this.nomeDipendente = nomeDipendente;
    }

    public String toString() {
        return "Cliente [codiceCliente=" + codiceCliente + ", cognomeCliente=" + cognomeCliente + ", nomeCliente="
                + nomeCliente + ", indirizzoCliente=" + indirizzoCliente + ", cittaCliente=" + cittaCliente
                + ", dataTelefonata=" + dataTelefonata + ", OraTelefonata=" + OraTelefonata + ", codiceDipendente="
                + codiceDipendente + ", CognomeDipendente=" + CognomeDipendente + ", nomeDipendente=" + nomeDipendente
                + "]";
    }

    
    
}
