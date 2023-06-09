package AA;

import javax.print.StreamPrintServiceFactory;

public class PcFisso_Server extends PcFisso{
    private int numProcessori; 
    private boolean raid;

    public PcFisso_Server(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo, int numProcessori, boolean raid,String tipoCase){
        super(processore, ram, memoriaDiMassa, marca, modello, sistemaOperativo,tipoCase);
        this.numProcessori = numProcessori; 
        this.raid = raid;
         
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
        return "PCFisso{" + '\n' + 
               "Marca: " + getMarca() + '\n' + 
               "Modello: " + getModello() + '\n' + 
               "Processore: " + getProcessore() + '\n' + 
               "RAM: " + getRam() + " GB "+ '\n' + 
               "Memoria di massa: " + getMemoriaDiMassa() + " GB " + '\n' +
               "Sistema operativo: " + getSistemaOperativo() + '\n' +
               "Numero di processori: " + numProcessori + '\n' +
               "RAID: " + raid + '\n' +
               "}"+ '\n';
    }
       
    
}
