public class Main {
    public static void main(String[] args) {
        KendaraanListrik[] kendaraan = {
            new MobilListrik(80, 20, 10),
            new MotorListrik(30, 10, 5),
            new MobilListrik(60, 45, 12),
            new MotorListrik(25, 20, 4)
        };

        double totalWaktu = 0;
        double totalEnergi = 0;

        for (KendaraanListrik k : kendaraan) {
            double waktu = k.hitungWaktuPengisian();
            double energi = k.hitungEnergiDibutuhkan();

            totalWaktu += waktu;
            totalEnergi += energi;

            System.out.printf("%s -> waktu: %.4f jam, energi: %.1f kWh%n", 
                              k.getNama(), waktu, energi);
        }

        System.out.printf("%nTotal waktu pengisian seluruh kendaraan: %.4f jam%n", totalWaktu);
        System.out.printf("Total energi dibutuhkan: %.1f kWh%n", totalEnergi);
    }
}