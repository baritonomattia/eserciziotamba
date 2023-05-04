public class Main{ 

    public static void Main(String[] args) {
        PC pc1 = new PC("Intel Core i5", 8, "Dell", "Inspiron", "Windows 10", "a");
        System.out.println(pc1);

        PcFisso_Desktop pc2 = new PcFisso_Desktop("ss", "aa", "so",16, "ss", "ss", "ss", "er", "t");
        System.out.println(pc2);

        //PcFisso_Server pc3 = new PcFisso_Server("Intel Xeon", 32, 2048, "IBM", "System x3650", "Linux", 2, true, "Grande");
        //System.out.println(pc3);

        //PcPortatili_Notebook pc4 = new PcPortatili_Notebook("Intel Core i5", 8, 512, "Lenovo", "ThinkPad X1 Carbon", "Windows 10", 13, true, "Full HD");
        //System.out.println(pc4);

        //PcPortatili_Palmari pc5 = new PcPortatili_Palmari("Qualcomm Snapdragon 865", 6, 256, "Samsung", "Galaxy Tab S7", "Android 11", 500, 5, "microSD");
        //System.out.println(pc5);
    }
}


/*public class Main{
    public static void main(String[] args) {
        
    // istanziazione oggetti PCFissoDesktop
        PC p = new PC("linux", "sss", "sss",16 , 32, "dd"); 
        //PcFisso_Desktop pcDesktop1 = new PCFisso_Desktop("Intel i7", 16, 1000, "HP", "Pavilion", "Windows", "Grande", "Nvidia", "Realtek");
        //PcFisso_Desktop pcDesktop2 = new PcFisso_Desktop("Intel i5", 8, 500, "Dell", "Inspiron", "Windows", "Piccolo", "AMD", "Realtek");
        // istanziazione oggetti PCFissoServer
        PcFisso_Server pcServer1 = new PcFisso_Server("Intel Xeon", 64, 2000, "IBM", "System x", "Linux", "Grande", 2, true);
        PcFisso_Server pcServer2 = new PcFisso_Server("AMD Epyc", 128, 4000, "HP", "ProLiant", "Windows", "Medio", 4, false);
        // istanziazione oggetti PCPortatileNotebook
        //PcPortatili_Notebook notebook1 = new PcPortatili_Notebook("Intel i7", 16, 1000, "Asus", "ZenBook", "Windows", 1.2, 14, true);
        //PcPortatili_Notebook notebook2 = new PcPortatili_Notebook("AMD Ryzen", 8, 512, "Lenovo", "ThinkPad", "Linux", 1.6, 15, false);
        // istanziazione oggetti PCPortatilePalmare
        //PcPortatili_Palmari palmare1 = new PcPortatili_Palmari("Qualcomm Snapdragon", 4, 64, "Samsung", "Galaxy Book", "Android", 0.5, 7, true, "micro-SD");
        //PcPortatili_Palmari palmare2 = new PcPortatili_Palmari("Mediatek Helio", 8, 128, "Xiaomi", "Mi Pad", "Android", 0.4, 8, false, "nano-SD");
        // invocazione dei metodi toString e equals
        //System.out.println(pcDesktop1);
        //System.out.println(pcDesktop2);
        System.out.println(pcServer1);
        System.out.println(pcServer2);
        //System.out.println(notebook1);
        //System.out.println(notebook2);
        //System.out.println(palmare1);
        //System.out.println(palmare2);
        System.out.println(pcDesktop1.equals(pcDesktop2));
        System.out.println(pcServer1.equals(pcServer2));
        System.out.println(notebook1.equals(notebook2));
        System.out.println(palmare1.equals(palmare2));
        System.out.println(p);
    }
}
*/