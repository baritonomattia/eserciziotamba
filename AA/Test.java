package AA;
public class Test{
    public static void main(String[] args) {
        //public PC(String processore, int ram, String memoriadimassa, String marca, String modello, String sistemaOperativo) 
        PC p1 = new PC("Intel Core i7", 16, "512 GB SSD", "HP", "EliteBook", "Windows 10 Pro"); 
        System.out.println(p1);
        //public PcFisso(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo)
        PcFisso p2 = new PcFisso("Intel Core i5", 8, "1 TB HDD", "Dell", "OptiPlex", "Windows 10 Pro"); 
        System.out.println(p2);
        //public PcFisso_Desktop(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo, String tipoSchedaVideo, String tipoSchedaAudio )
        PcFisso_Desktop p3 = new PcFisso_Desktop("Intel Core i7", 16, "512 GB SSD", "HP", "EliteDesk", "Windows 10 Pro", "Nvidia GeForce RTX 3070", "Realtek HD Audio"); 
        System.out.println(p3);
        //public PcFisso_Server(String processore, int ram, String memoriaDiMassa, String marca, String modello, String sistemaOperativo, int numProcessori, boolean raid){
        PcFisso_Server p4 = new PcFisso_Server("Intel Xeon E5-2620 v4", 32, "4 TB HDD", "Dell", "PowerEdge", "Windows Server 2019", 2, true);     
        System.out.println(p4);
        //public PcPortatili_Notebook(String marca, String modello, String sistemaOperativo, int memoriaRAM, int memoriaDiMassa, double peso, double altezza, double larghezza, double profondita, double dimensioneVideo, boolean wifi, boolean webcam)
        PcPortatili_Notebook notebook1 = new PcPortatili_Notebook("Intel i7", "a", "a", 34,4, 67, 1, 2, 3, 4, true, true );
        System.out.println(notebook1);
        //public PcPortatili_Palmari(String marca, String modello, String sistemaOperativo, int memoriaRAM, int memoriaDiMassa, double peso, double altezza, double larghezza, double profondita, double dimensioneVideo, boolean wifi, boolean bluetooth, String tipoMemoria)
        PcPortatili_Palmari palmare1 = new PcPortatili_Palmari("Samsung", "Qualcomm Snapdragon", "Android", 4, 64,  0.5, 3.0, 7.5, 6.2, 9.9, true, true, "micro-SD");
        System.out.println(palmare1);
    }
}