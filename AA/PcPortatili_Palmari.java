package AA;


public class PcPortatili_Palmari extends PcPortatile {
    private boolean bluetooth;
    private String tipoMemoria;

    public PcPortatili_Palmari(String processore,int ram,String memoriaDiMassa,String marca, String modello, String sistemaOperativo,   double peso, double altezza, double larghezza, double profondita, double dimensioneVideo, boolean wifi,boolean bluetooth, String tipoMemoria) {
                    super(processore,ram,memoriaDiMassa, marca, modello, sistemaOperativo, peso, altezza, larghezza, profondita, dimensioneVideo, wifi);
        this.bluetooth = bluetooth;
        this.tipoMemoria = tipoMemoria;
    }


    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String toString() {
        return "Pc portatile palmare " + '\n' +   
               "Marca: " + getMarca()  + '\n' +   
               "Modello: " + getModello() + '\n' +   
               "Processore: " + getProcessore() + '\n' +   
               "RAM: " + getRam() + " GB "+ '\n' +   
               "Memoria di massa: " + getMemoriaDiMassa() + " GB " + '\n' +   
               "Dimensioni: " + getAltezza() + "x" + getLarghezza() + "x" + getProfondita() + " cm " + '\n' +   
               "Peso: " + getPeso() + " kg " + '\n' +   
               "Dimensione video : " + getDimensioneVideo() + "" + '\n' +   
               "Wifi: " + (isWifi() ? "presente" : "assente") + ""+ '\n' +   
               "Bluetooth: " + (isBluetooth() ? "presente" : "assente") + "" + '\n' +    
               "Tipo di memoria: " + tipoMemoria + '\n' + "}" +  + '\n';  
    }
    
    
}
