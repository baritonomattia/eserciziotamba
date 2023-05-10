package AA;

import java.util.Objects;

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
        return "Pc portatile palmare " +        
               "Marca: " + getMarca()  +
               "Modello: " + getModello() +
               "Processore: " + getProcessore() +
               "RAM: " + getRam() + " GB "+
               "Memoria di massa: " + getMemoriaDiMassa() + " GB " +
               "Dimensioni: " + getAltezza() + "x" + getLarghezza() + "x" + getProfondita() + " cm " +
               "Peso: " + getPeso() + " kg " +
               "Dimensione video : " + getDimensioneVideo() + "" +
               "Wifi: " + (isWifi() ? "presente" : "assente") + ""+ 
               "Bluetooth: " + (isBluetooth() ? "presente" : "assente") + "" + 
               "Tipo di memoria: " + tipoMemoria; 
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PcPortatili_Palmari)) return false;
        if (!super.equals(o)) return false;
        PcPortatili_Palmari palmare = (PcPortatili_Palmari) o;
        return bluetooth == palmare.bluetooth &&
                Objects.equals(tipoMemoria, palmare.tipoMemoria);
    }
}
