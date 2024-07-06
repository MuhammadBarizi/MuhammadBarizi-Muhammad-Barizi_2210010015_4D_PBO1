package penduduk;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PengelolaanPenduduk {

    private static ArrayList<Penduduk> daftarPenduduk = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Pengelolaan Data Penduduk ===");
            System.out.println("1. Tambah Data Penduduk");
            System.out.println("2. Tampilkan Semua Data Penduduk");
            System.out.println("3. Cari Penduduk Berdasarkan NIK");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1/2/3/4): ");

            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine(); 

                switch (pilihan) {
                    case 1 ->
                        tambahPenduduk(scanner);
                    case 2 ->
                        tampilkanSemuaPenduduk();
                    case 3 ->
                        cariPenduduk(scanner);
                    case 4 -> {
                        System.out.println("Keluar dari aplikasi.");
                        return;
                    }
                    default ->
                        System.out.println("Opsi tidak valid. Silakan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka 1, 2, 3, atau 4.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }

    private static void tambahPenduduk(Scanner scanner) {
        try {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            if (nama.matches(".*\\d.*")) {
                throw new IllegalArgumentException("Nama tidak boleh mengandung angka.");
            }


        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();

       if (!nik.matches(".*\\d.*")) {
                throw new IllegalArgumentException("NIK harus 12 digit dan angka.");
       }
            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd): ");
            String tanggalLahir = scanner.nextLine();

            if (isDewasa(nik)) {
                System.out.print("Masukkan Pekerjaan: ");
                String pekerjaan = scanner.nextLine();
                PendudukDewasa pendudukDewasa = new PendudukDewasa(nama, nik, alamat, tanggalLahir, pekerjaan);
                daftarPenduduk.add(pendudukDewasa);
                System.out.println("Data Penduduk Dewasa berhasil ditambahkan.\n");
            } else {
                System.out.print("Masukkan Nama Orang Tua: ");
                String namaOrangTua = scanner.nextLine();
                System.out.print("Masukkan Nama Sekolah: ");
                String sekolah = scanner.nextLine();
                PendudukAnak pendudukAnak = new PendudukAnak(nama, nik, alamat, tanggalLahir, namaOrangTua, sekolah);
                daftarPenduduk.add(pendudukAnak);
                System.out.println("Data Penduduk Anak berhasil ditambahkan.\n");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Input tidak valid: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }

    private static void tampilkanSemuaPenduduk() {
        if (daftarPenduduk.isEmpty()) {
            System.out.println("Tidak ada data penduduk yang terdaftar.");
        } else {
            for (Penduduk penduduk : daftarPenduduk) {
                System.out.println(penduduk.displayInfo());
                System.out.println("-----------------------");
            }
        }
    }

    private static void cariPenduduk(Scanner scanner) {
        System.out.print("Masukkan NIK yang ingin dicari: ");
        String nik = scanner.nextLine();

        if (!nik.matches(".*\\d.*")) {
            System.out.println("NIK yang anda tulis tidak sesuai!.");
            return;
        }
 
        for (Penduduk penduduk : daftarPenduduk) {
            if (penduduk.getNik().equals(nik)) {
                System.out.println("Data Penduduk Ditemukan:");
                System.out.println(penduduk.displayInfo());
                return;
            }
        }
        System.out.println("Penduduk dengan NIK " + nik + " tidak ditemukan.");
    }

    private static boolean isDewasa(String nik) {
        return nik.length() > 12;
    }
}
