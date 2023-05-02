public abstract class PcPortatile extends PC{
    private double peso;
    private double altezza;
    private double larghezza;
    private double profondita;
    private double dimensioneVideo;
    private boolean Wifi;

    public PcPortatile(String marca, String modello, String sistemaOperativo,
                       double memoriaRAM, double memoriaDiMassa, double peso,
                       double altezza, double larghezza, double profondita,
                       double dimensioneVideo, boolean haWifi) {
        super(marca, modello, sistemaOperativo, memoriaRAM, memoriaDiMassa);
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.dimensioneVideo = dimensioneVideo;
        this.Wifi = Wifi;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getProfondita() {
        return profondita;
    }

    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }

    public double getDimensioneVideo() {
        return dimensioneVideo;
    }

    public void setDimensioneVideo(double dimensioneVideo) {
        this.dimensioneVideo = dimensioneVideo;
    }

    public boolean isWifi() {
        return Wifi;
    }

    public void setWifi(boolean Wifi) {
        this.Wifi = Wifi;
    }

    public String toString() {
        return 
                "Peso: " + peso + " kg\n" +
                "Dimensioni: " + larghezza + " x " + altezza + " x " + profondita + " cm\n" +
                "Dimensione video: " + dimensioneVideo + " pollici\n" +
                "Wifi: " + (Wifi ? "Sì" : "No") + "\n";
    }
}
