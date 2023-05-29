package AA;
public class Test{
    public static void main(String[] args) {
        
        PcFisso p1 = new PcFisso("Intel Core i5", 8, "1 TB HDD", "Dell", "OptiPlex", "Windows 10 Pro","case"); 
        System.out.println(p1);
        
        PcFisso_Desktop p2 = new PcFisso_Desktop("Intel Core i7", 16, "512 GB SSD", "HP", "EliteDesk", "Windows 10 Pro", "Nvidia GeForce RTX 3070", "Realtek HD Audio","case"); 
        System.out.println(p2);

        PcFisso_Server p3 = new PcFisso_Server("Intel Xeon E5-2620 v4", 32, "4 TB HDD", "Dell", "PowerEdge", "Windows Server 2019", 2, true,"case");     
        System.out.println(p3);

        PcPortatili_Notebook notebook1 = new PcPortatili_Notebook("Intel i7",2, "a", "a", "34","windows", 67, 1, 2, 3, 4, true, true );
        System.out.println(notebook1);

        PcPortatili_Palmari palmare1 = new PcPortatili_Palmari("Samsung",2, "Qualcomm Snapdragon", "Android", "4", "windows",  0.5, 3.0, 7.5, 6.2, 9.9, true, true, "micro-SD");
        System.out.println(palmare1);
    }

    

    
}
