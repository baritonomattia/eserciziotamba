package AA;

public class PcFisso_Desktop extends PcFisso{
    private String tipoSchedaVideo;
    private String tipoSchedaAudio;
    public PcFisso_Desktop(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo, String tipoSchedaVideo, String tipoSchedaAudio ,String tipoCase)
    {
        super(processore, ram, memoriaDiMassa, marca, modello, sistemaOperativo,tipoCase);
        this.tipoSchedaVideo = tipoSchedaVideo;
        this.tipoSchedaAudio = tipoSchedaAudio;
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


    public String toString() {
        return "PCFisso{" + "processore='" + getProcessore() + '\'' + ", ram=" + getRam() + ", memoriaDiMassa=" + getMemoriaDiMassa() + ", marca='" + getMarca() + '\'' + ", modello='" + getModello() + '\'' + ", sistemaOperativo='" + getSistemaOperativo() + '\'' +
        "tipoSchedaVideo " + tipoSchedaVideo + '\'' + "tipoSchedaAudio " + tipoSchedaAudio + "}";
    }
   
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PcFisso_Desktop)) return false;
        if (!super.equals(o)) return false;
        PcFisso_Desktop that = (PcFisso_Desktop) o;
        return tipoSchedaVideo == that.tipoSchedaVideo &&
        tipoSchedaAudio == that.tipoSchedaAudio;
         }
    


}
