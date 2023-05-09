package AA;

public class PcFisso extends PC{
    private String tipoCase;
        
    public PcFisso(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo){
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
        "Pc Portatile {" + "processore='" + processore + '\'' + ", ram=" + ram + ", memoriaDiMassa=" + memoriaDiMassa + ", marca='" + marca + '\'' + ", modello='" + modello + '\'' + ", sistemaOperativo='" + sistemaOperativo + '\'' + "tipo di case " + tipoCase + "}"; 
    }

        
    
}
