public class PcFisso_Server extends PcFisso {
    
    private int numeroProcessori;
    private boolean raid;

    public PcFisso_Server(String marca, String modello, String sistemaOperativo, int memoriaRAM, int memoriaDiMassa,
                         String tipoProcessore, String caseType, int tipoSchedaVideo, int tipoSchedaAudio,
                         int numeroProcessori, boolean raid) {
        super(marca, modello, sistemaOperativo, memoriaRAM, memoriaDiMassa, tipoProcessore, caseType, tipoSchedaVideo, tipoSchedaAudio);
        this.numeroProcessori = numeroProcessori;
        this.raid = raid;
    }

    public int getNumeroProcessori() {
        return numeroProcessori;
    }

    public void setNumeroProcessori(int numeroProcessori) {
        this.numeroProcessori = numeroProcessori;
    }

    public boolean getRAID() { 
        return raid;
    }

    public void setRAID(boolean raid) {
        this.raid = raid;
    }

    public String toString() {
        return ", Numero processori: " + numeroProcessori + ", RAID: " + (raid ? "presente" : "assente");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PcFisso_Server)) return false;
        if (!super.equals(o)) return false;
        PcFisso_Server that = (PcFisso_Server) o;
        return numeroProcessori == that.numeroProcessori &&
                raid == that.raid;
    }
} 

