import java.util.ArrayList;

public class DataMahasiswa {
    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    public void tambah(Mahasiswa mhs) {
        daftar.add(mhs);
        System.out.println("Data berhasil ditambahkan!");
    }

    public Mahasiswa cari(String npm) {
        for (Mahasiswa m : daftar) {
            if (m.getNpm().equals(npm)) {
                return m;
            }
        }
        return null;
    }

    public void edit(String npm, String namaBaru, String alamatBaru) {
        Mahasiswa m = cari(npm);
        if (m != null) {
            m.setNama(namaBaru);
            m.setAlamat(alamatBaru);
            System.out.println("Data berhasil diubah!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public void hapus(String npm) {
        Mahasiswa m = cari(npm);
        if (m != null) {
            daftar.remove(m);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public void tampil() {
        System.out.println("\n===== DATA MAHASISWA =====");
        for (Mahasiswa m : daftar) {
            System.out.println(m);
        }
        System.out.println("==========================");
    }
}
