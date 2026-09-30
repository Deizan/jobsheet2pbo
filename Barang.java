public class Barang {

    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih() {
        return hargaKotor - (diskon * hargaKotor);
    }

    public void displayInfo() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Harga Kotor  : Rp" + hargaKotor);
        System.out.println("Diskon       : " + (diskon * 100) + "%");
        System.out.println("Harga Bersih : Rp" + getHargaBersih());
    }
}