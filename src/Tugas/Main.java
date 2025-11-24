import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataMahasiswa data = new DataMahasiswa();

        int pilih;
        do {
            System.out.println("\n====== MENU DATA MAHASISWA ======");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Tampil Semua Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // buang enter

            switch (pilih) {
                case 1:
                    System.out.print("NPM    : ");
                    String npm = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc.nextLine();
                    data.tambah(new Mahasiswa(npm, nama, alamat));
                    break;

                case 2:
                    System.out.print("Masukkan NPM yang dicari: ");
                    String cari = sc.nextLine();
                    Mahasiswa hasil = data.cari(cari);
                    if (hasil != null) {
                        System.out.println("Data ditemukan: " + hasil);
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NPM yang ingin diedit: ");
                    String edit = sc.nextLine();
                    System.out.print("Nama baru   : ");
                    String namaBaru = sc.nextLine();
                    System.out.print("Alamat baru : ");
                    String alamatBaru = sc.nextLine();
                    data.edit(edit, namaBaru, alamatBaru);
                    break;

                case 4:
                    System.out.print("Masukkan NPM yang ingin dihapus: ");
                    String del = sc.nextLine();
                    data.hapus(del);
                    break;

                case 5:
                    data.tampil();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);
    }
}
