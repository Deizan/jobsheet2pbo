public class BarangDemo {

    public static void main(String[] args) {

        Barang barang1 = new Barang();

        barang1.kode = "BRG001";
        barang1.nama = "Laptop Lenovo";
        barang1.hargaKotor = 10000000;
        barang1.diskon = 0.10;

        barang1.displayInfo();
    }
}