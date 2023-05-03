public class Main{

    public static void Main(String[] args) {
        PC pc1 = new PC("Intel Core i5", 8, 512, "Dell", "Inspiron", "Windows 10", modello2);
        System.out.println(pc1);

        PcFisso_Desktop pc2 = new PcFisso_Desktop("Intel Core i7", 16, 1024, "HP", "EliteDesk", "Windows 10", "ATI Radeon", "Realtek HD Audio", "Grande");
        System.out.println(pc2);

        PcFisso_Server pc3 = new PcFisso_Server("Intel Xeon", 32, 2048, "IBM", "System x3650", "Linux", 2, true, "Grande");
        System.out.println(pc3);

        PcPortatili_Notebook pc4 = new PcPortatili_Notebook("Intel Core i5", 8, 512, "Lenovo", "ThinkPad X1 Carbon", "Windows 10", 13, true, "Full HD");
        System.out.println(pc4);

        PcPortatili_Palmari pc5 = new PcPortatili_Palmari("Qualcomm Snapdragon 865", 6, 256, "Samsung", "Galaxy Tab S7", "Android 11", 500, 5, "microSD");
        System.out.println(pc5);
    }
}