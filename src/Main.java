
public class Main {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("Belajar JAVA", "Umar Bakrie");
        perpus.tambahBuku("Java Untuk Pemula", "Amir Mahmud");
        perpus.tambahBuku("Java untuk Ahli", "Salim Iklim");
        System.out.println("Jumlah buku:" + perpus.jumlahBuku()); // 3
        perpus.tambahBuku("Java untuk Mahasiswa", "Farid Akbar");

// cari buku
        String cari = "Pemula";
        System.out.println("Cari buku dengan kata kunci: " + cari);
        Buku buku = perpus.cariBuku(cari);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan");
        } else {
        }
        System.out.println("Buku ditemukan dengan judul: " + buku.getJudul() + ", pengarang: " + buku.getPengarang());
// ganti buku
        perpus.gantiBuku(0, "Belajar JAVA Baru", "Umar Bakrie Salim");
        buku = perpus.lihatBuku(0);
        System.out.println("Buku diganti dengan judul: " + buku.getJudul() + ", pengarang: " + buku.getPengarang());
// hapus buku
        perpus.hapusBuku(0);
        System.out.println("Jumlah buku: " + perpus.jumlahBuku());
    }
}
