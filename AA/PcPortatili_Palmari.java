package AA;

import java.util.Objects;

public class PcPortatili_Palmari extends PcPortatile {
    private boolean bluetooth;
    private String tipoMemoria;

    public PcPortatili_Palmari(String marca, String modello, String sistemaOperativo, int memoriaRAM, int memoriaDiMassa, double peso,
                   double altezza, double larghezza, double profondita, double dimensioneVideo, boolean wifi,
                   boolean bluetooth, String tipoMemoria) {
        super(marca, modello, sistemaOperativo, memoriaRAM, memoriaDiMassa, peso, altezza, larghezza, profondita, dimensioneVideo, wifi);
        this.bluetooth = bluetooth;
        this.tipoMemoria = tipoMemoria;
    }


    public boolean hasBluetooth() {
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
        
        return " Bluetooth: " + (bluetooth ? "presente" : "assente") + ", Tipo di memoria di massa: " + tipoMemoria;
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