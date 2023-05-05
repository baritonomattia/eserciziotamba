package AA;

public class PcPortatili_Notebook extends PcPortatile {
    private boolean webcam;
    
    public PcPortatili_Notebook(String marca, String modello, String sistemaOperativo, int memoriaRAM, int memoriaDiMassa, double peso,
    double altezza, double larghezza, double profondita, double dimensioneVideo, boolean wifi, boolean webcam) {
       super(marca, modello, sistemaOperativo, memoriaRAM, memoriaDiMassa, peso, altezza, larghezza, profondita, dimensioneVideo, wifi);
       this.webcam = webcam;
   }
    public boolean hasWebcam()
    {
       return webcam;
    }
   
   public void setWebcam(boolean webcam)
   {
       this.webcam = webcam;
   }   
    public String toString(){
       return  ", Webcam: " + (webcam ? "presente" : "assente");
   }
   public boolean equals(Object o){
   
        if (this == o) 
           return true;
        if (!(o instanceof PcPortatili_Notebook)) 
           return false;
       if (!super.equals(o)) 
           return false;
           PcPortatili_Notebook notebook = (PcPortatili_Notebook) o;
       return webcam == notebook.webcam;
       }
   
   }
   
   
   
   
   
   
   