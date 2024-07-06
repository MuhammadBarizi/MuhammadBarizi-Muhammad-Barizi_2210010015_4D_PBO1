package penduduk;

public class Penduduk {

    private String nama;
    private String nik;
    private String alamat;
    private String tanggalLahir;

    public Penduduk(String nama, String nik, String alamat, String tanggalLahir) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String displayInfo() {
        return "Nama: " + getNama()
                + "\nNIK: " + getNik()
                + "\nAlamat: " + getAlamat()
                + "\nTanggal Lahir: " + getTanggalLahir();
    }
}
