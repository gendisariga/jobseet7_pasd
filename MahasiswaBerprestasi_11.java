public class MahasiswaBerprestasi_11 {

    Mahasiswa_11 listMhs[] = new Mahasiswa_11[5];
    int idx;

    void tambah(Mahasiswa_11 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
    }

    void tampil() {
        for (Mahasiswa_11 m : listMhs) {
            m.tampilInformasi();
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan IPK " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM   : " + listMhs[pos].nim);
            System.out.println("Nama  : " + listMhs[pos].nama);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK   : " + listMhs[pos].ipk);
        }
    }
    int findBinarySearch(double cari, int left, int right) {
    int mid;

    if (right >= left) {
        mid = (left + right) / 2;

        if (listMhs[mid].ipk == cari) {
            return mid;
        } else if (listMhs[mid].ipk < cari) { 
            return findBinarySearch(cari, left, mid - 1);
        } else {
            return findBinarySearch(cari, mid + 1, right);
        }
    }

    return -1;
}
}