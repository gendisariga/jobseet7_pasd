import java.util.Scanner;
public class MainMahasiswaDemo_11 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi_11 list = new MahasiswaBerprestasi_11();


        list.tambah(new Mahasiswa_11("111", "adi", "2A", 3.1));
        list.tambah(new Mahasiswa_11("222", "ila", "2A", 3.2));
        list.tambah(new Mahasiswa_11("333", "lia", "2A", 3.3));
        list.tambah(new Mahasiswa_11("444", "susi", "2A", 3.5));
        list.tambah(new Mahasiswa_11("555", "anita", "2A", 3.7));

        System.out.println("Data Mahasiswa");
        System.out.println("----------------------------");
        list.tampil();

        // Sequential Search
        System.out.println("Pencarian data");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Search");
        int posisi = list.sequentialSearching(cari);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        // Binary Search
        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        cari = sc.nextDouble();
        System.out.print("Masukkan jumlah mahasiswa: ");


        System.out.println("Menggunakan Binary Search");
        System.out.println("--------------------------------------------------");

        int posisi2 = list.findBinarySearch(cari, 0, list.idx - 1);

        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
    }
}