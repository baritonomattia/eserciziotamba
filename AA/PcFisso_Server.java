package AA;

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
        return "PCFisso{" + "processore='" + getProcessore() + '\'' + ", ram=" + getRam() + ", memoriaDiMassa=" + getMemoriaDiMassa() + ", marca='" + getMarca() + '\'' + ", modello='" + getModello() + '\'' + ", sistemaOperativo='" + getSistemaOperativo() + '\'' +
        "numprocessori" + numProcessori +  '\'' + "raid " + raid + "}";
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PcFisso_Server)) return false;
        if (!super.equals(o)) return false;
        PcFisso_Server that = (PcFisso_Server) o;
        return numProcessori == that.numProcessori &&
                raid == that.raid;
    }
    
    
}
