package penduduk;

import penduduk.Penduduk;

public class PendudukAnak extends Penduduk {

    private String namaOrangTua;
    private String sekolah;

    public PendudukAnak(String nama, String nik, String alamat, String tanggalLahir, String namaOrangTua, String sekolah) {
        super(nama, nik, alamat, tanggalLahir);
        this.namaOrangTua = namaOrangTua;
        this.sekolah = sekolah;
    }

    public void setNamaOrangTua(String namaOrangTua) {
        this.namaOrangTua = namaOrangTua;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }
    

    public String getNamaOrangTua() {
        return namaOrangTua;
    }

    public String getSekolah() {
        return sekolah;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nNama Orang Tua: " + namaOrangTua
                + "\nSekolah: " + sekolah;
    }
}
