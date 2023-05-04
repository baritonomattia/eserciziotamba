public class PcFisso extends PC {
    private String tipoCase;
    private String tipoSchedaVideo;
    private String tipoSchedaAudio;
    protected int numProcessori;
    private boolean raid;

    public PcFisso(String marca, String modello, String processore, int ram, int memoriaDiMassa, String sistemaOperativo,
                   String tipoCase, String tipoSchedaVideo, String tipoSchedaAudio, int numProcessori, boolean raid) {
        super(marca, modello, processore, ram, memoriaDiMassa, sistemaOperativo);
        this.tipoCase = tipoCase;
        this.tipoSchedaVideo = tipoSchedaVideo;
        this.tipoSchedaAudio = tipoSchedaAudio;
        this.numProcessori = numProcessori;
        this.raid = raid;
    }


    public PcFisso(String marca, String modello, String sistemaOperativo, int memoriaRAM, int memoriaDiMassa,
            String tipoProcessore, String caseType, int tipoSchedaVideo2, int tipoSchedaAudio2) {
    }


    /*public void PcFisso(String marca, String modello, String sistemaOperativo, String memoriaRAM, String memoriaDiMassa,
            String tipoProcessore, String caseType) {
    }*//

    public String getTipoCase() {
        return tipoCase;
    }

    public void setTipoCase(String tipoCase) {
        this.tipoCase = tipoCase;
    }

    public String getTipoSchedaVideo() {
        return tipoSchedaVideo;
    }

    public void setTipoSchedaVideo(String tipoSchedaVideo) {
        this.tipoSchedaVideo = tipoSchedaVideo;
    }

    public String getTipoSchedaAudio() {
        return tipoSchedaAudio;
    }

    public void setTipoSchedaAudio(String tipoSchedaAudio) {
        this.tipoSchedaAudio = tipoSchedaAudio;
    }

    public int getNumProcessori() {
        return numProcessori;
    }

    public void setNumProcessori(int numProcessori) {
        this.numProcessori = numProcessori;
    }

    public boolean isRaid() {
        return raid;
    }

    public void setRaid(boolean raid) {
        this.raid = raid;
    }

    public String toString() {
        return "PCFisso{" +
                "marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                ", processore='" + getProcessore() + '\'' +
                ", ram=" + getRam() +
                ", memoriaDiMassa=" + getMemoriaDiMassa() +
                ", sistemaOperativo='" + getSistemaOperativo() + '\'' +
                ", tipoCase='" + tipoCase + '\'' +
                ", tipoSchedaVideo='" + tipoSchedaVideo + '\'' +
                ", tipoSchedaAudio='" + tipoSchedaAudio + '\'' +
                ", numProcessori=" + numProcessori +
                ", raid=" + raid +
                '}';
    }
}
