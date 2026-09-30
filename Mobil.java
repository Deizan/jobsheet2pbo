public class Mobil {

    public String merek;
    public String warna;
    public int kecepatan;

    public void displayInfo() {
        System.out.println("Merek     : " + merek);
        System.out.println("Warna     : " + warna);
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }

    public void tambahKecepatan(int tambahan) {
        kecepatan += tambahan;
    }

    public void kurangiKecepatan(int pengurangan) {
        kecepatan -= pengurangan;

        if (kecepatan < 0) {
            kecepatan = 0;
        }
    }
}