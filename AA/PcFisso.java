package AA;

public class PcFisso extends PC{
    private String tipoCase;
        
    public PcFisso(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo,String tipoCase){
        super(processore, ram, memoriaDiMassa, marca, modello, sistemaOperativo); 
        this.tipoCase = tipoCase; 
        
    }
    
    public void setTipoCase(String tipoCase){
        this.tipoCase = tipoCase; 
    }

    public String getTipoCase() {
        return tipoCase;
    }


    public String toString() {
        return 
        "Pc Fisso {" + "processore='" + getProcessore() + '\'' + ", ram=" + getRam() + ", memoriaDiMassa=" + getMemoriaDiMassa() + ", marca='" + getMarca() + '\'' + ", modello='" + getModello() + '\'' + ", sistemaOperativo='" + getSistemaOperativo() + '\'' + "tipo di case " + tipoCase + "}"; 
    }

        
    
}
