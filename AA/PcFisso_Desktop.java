package AA;

public class PcFisso_Desktop extends PcFisso{
    private String tipoSchedaVideo;
    private String tipoSchedaAudio;
    
    public PcFisso_Desktop(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo, String tipoSchedaVideo, String tipoSchedaAudio ){
        super(processore, ram, memoriaDiMassa, marca, modello, sistemaOperativo);
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

    @Override
    public String toString() {
        return "PcFisso_Desktop [tipoSchedaVideo=" + tipoSchedaVideo + ", tipoSchedaAudio=" + tipoSchedaAudio + "]";
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
