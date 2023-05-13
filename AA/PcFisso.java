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
        return "Pc Fisso {" + '\n' + 
               "Marca: " + getMarca() + '\n' + 
               "Modello: " + getModello() + '\n' + 
               "Processore: " + getProcessore() + '\n' + 
               "RAM: " + getRam() + " GB "+ '\n' + 
               "Memoria di massa: " + getMemoriaDiMassa() + " GB " + '\n' + 
               "Tipo di case: " + tipoCase + '\n' +
               "}";
    }
    
        
    
}
