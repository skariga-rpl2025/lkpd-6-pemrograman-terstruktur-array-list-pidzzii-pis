

public class Buku {
    private final String judul;
    private final String pengarang;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String tampil() {
        return "Judul: " + judul + ", Pengarang: " + pengarang;
    }
}