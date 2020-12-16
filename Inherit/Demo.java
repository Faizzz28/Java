public class Demo {
    public static void main (String[] args) {

        DataTI Ket1 = new DataTI();
        Ket1.displayTI();
        DataTI TI1 = new DataTI();
        TI1.namaMhs = "Faiz Ahmad";
        TI1.NIM = "0110219055";
        TI1.display();
        TI1.namaMhs = "Fajar Firdaus";
        TI1.NIM = "0110219100";
        TI1.display();

        System.out.println("");
        System.out.println("============================================================");
        System.out.println("");

        DataSI Ket2 = new DataSI();
        Ket2.displaySI();
        DataSI SI1 = new DataSI();
        SI1.namaMhs = "M. Rafi Syamil";
        SI1.NIM = "0110119045";
        SI1.display();
        DataSI SI2 = new DataSI();
        SI2.namaMhs = "Redi Ramdani";
        SI2.NIM = "0110119003";
        SI2.display();

    }
}
