public class PcFisso_Desktop extends PcFisso {
    private String tipoSchedaVideo;
    private String tipoSchedaAudio;
    
    public PcFisso_Desktop(String marca, String modello, String sistemaOperativo, String memoriaRAM, String memoriaDiMassa,
    String tipoProcessore, String caseType, String tipoSchedaVideo, String tipoSchedaAudio) {
        super(marca, modello, sistemaOperativo, memoriaRAM, memoriaDiMassa, tipoProcessore, caseType);
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
     return ", Tipo scheda video: " + tipoSchedaVideo + ", Tipo scheda audio: " + tipoSchedaAudio;
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
 