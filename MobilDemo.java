public class MobilDemo {

    public static void main(String[] args) {

        // Instansiasi object pertama
        Mobil mobil1 = new Mobil();

        // Instansiasi object kedua
        Mobil mobil2 = new Mobil();


        // =========================
        // OBJECT 1
        // =========================

        mobil1.merek = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.kecepatan = 60;


        // =========================
        // OBJECT 2
        // =========================

        mobil2.merek = "Honda";
        mobil2.warna = "Putih";
        mobil2.kecepatan = 70;


        // Menampilkan data awal
        System.out.println("===== DATA AWAL =====");

        System.out.println("\nMobil 1");
        mobil1.displayInfo();

        System.out.println("\nMobil 2");
        mobil2.displayInfo();


        // =========================
        // UPDATE ATTRIBUTE
        // =========================

        mobil1.warna = "Merah";
        mobil1.tambahKecepatan(20);

        mobil2.warna = "Biru";
        mobil2.kurangiKecepatan(10);


        // Menampilkan data setelah update
        System.out.println("\n===== SETELAH UPDATE =====");

        System.out.println("\nMobil 1");
        mobil1.displayInfo();

        System.out.println("\nMobil 2");
        mobil2.displayInfo();
    }
}