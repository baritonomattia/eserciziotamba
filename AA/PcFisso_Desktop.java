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
        return "PCFisso{" + '\n' + 
               "Marca: " + getMarca() + '\n' + 
               "Modello: " + getModello() + '\n' + 
               "Processore: " + getProcessore() + '\n' + 
               "RAM: " + getRam() + " GB "+ '\n' + 
               "Memoria di massa: " + getMemoriaDiMassa() + " GB " + '\n' +
               "Sistema operativo: " + getSistemaOperativo() + '\n' +
               "Tipo scheda video: " + tipoSchedaVideo + '\n' +
               "Tipo scheda audio: " + tipoSchedaAudio + '\n' +
               "}" + '\n';
    }
    

    


}
