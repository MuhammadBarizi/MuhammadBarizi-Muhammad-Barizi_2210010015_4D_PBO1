package penduduk;

import penduduk.Penduduk;

public class PendudukDewasa extends Penduduk {

    private String pekerjaan;

    public PendudukDewasa(String nama, String nik, String alamat, String tanggalLahir, String pekerjaan) {
        super(nama, nik, alamat, tanggalLahir);
        this.pekerjaan = pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
    

    public String getPekerjaan() {
        return pekerjaan;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nPekerjaan: " + pekerjaan;
    }
}
