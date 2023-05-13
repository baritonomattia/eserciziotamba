package AA;


public class PcPortatili_Notebook extends PcPortatile {
    private boolean webcam;
    
    public PcPortatili_Notebook(String processore,int ram, String memoriaDiMassa,String marca, String modello, String sistemaOperativo,  double peso,double altezza, double larghezza, double profondita, double dimensioneVideo, boolean wifi, boolean webcam) {
       super(processore,ram,memoriaDiMassa, marca, modello, sistemaOperativo, peso, altezza, larghezza, profondita, dimensioneVideo, wifi);
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
               "Webcam: " + hasWebcam() + "} " + "\n"; 
    }
    
}
      