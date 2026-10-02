public class MahasiswaDemo {

    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();

        m1.nim = "254107060154";
        m1.nama = "Muhammad Deizan Nafi' Fakhri";
        m1.alamat = "Malang, Jawa Timur";
        m1.kelas = "2D";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();

        m2.nim = "254107060150";
        m2.nama = "Muhammad Deizan Nafi'";
        m2.alamat = "Surabaya, Jawa Timur";
        m2.kelas = "2D";

        m2.displayBiodata();

    }
}
