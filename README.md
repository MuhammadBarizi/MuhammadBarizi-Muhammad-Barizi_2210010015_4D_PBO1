# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pengelolaan penduduk menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.
`Jika nik tidak sampai 16 digit maka menjadi Data Anak`




=== Pengelolaan Data Penduduk ===
Aplikasi ini menerima input berupa 1. Tambah Data Penduduk, 2. Tampilkan Semua Data Penduduk, 3. Cari Penduduk Berdasarkan NIK, 4. Keluar, dan memberikan output berupa informasi detail dari Pilih opsi (1/2/3/4): 1
Masukkan Nama: Barizi
Masukkan NIK: 123456789111
Masukkan Alamat: Martapura
Masukkan Tanggal Lahir (yyyy-mm-dd): 2003-10-08
Masukkan Nama Orang Tua: Ariani
Masukkan Nama Sekolah: SMK Cendana DDI Samarinda
Data Penduduk Anak berhasil ditambahkan.
tersebut seperti tahun Nama, NIK, Alamat, Tanggal Lahir, Nama Orang Tua, Nama Sekolah.

`Jika data nik lebih dari 16 maka data menjadi data penduduk`
=== Pengelolaan Data Penduduk ===
1. Tambah Data Penduduk
2. Tampilkan Semua Data Penduduk
3. Cari Penduduk Berdasarkan NIK
4. Keluar
Pilih opsi (1/2/3/4): 1
Masukkan Nama: Syaifuiddin
Masukkan NIK: 123456789111111
Masukkan Alamat: Martapura
Masukkan Tanggal Lahir (yyyy-mm-dd): 1989-10-08
Masukkan Pekerjaan: Petani
Data Penduduk Dewasa berhasil ditambahkan.




## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Penduduk`, `PendudukDewasa`,  `PendudukAnak` `dan`  `PengelolaanPenduduk` adalah contoh dari class.

```bash
public class Penduduk {
    ...
}

public class PendudukDewasa extends Penduduk {
    ...
}

public class PendudukAnak extends Penduduk {
    ...
}

```

2. **Object** adalah instance dari class. Pada kode ini, ` PendudukDewasa pendudukDewasa = new PendudukDewasa(nama, nik, alamat, tanggalLahir, pekerjaan);` `dan` `PendudukAnak pendudukAnak = new PendudukAnak(nama, nik, alamat, tanggalLahir, namaOrangTua, sekolah);` adalah contoh pembuatan object.

```bash
 PendudukDewasa pendudukDewasa = new PendudukDewasa(nama, nik, alamat, tanggalLahir, pekerjaan);
```
```bash
PendudukAnak pendudukAnak = new PendudukAnak(nama, nik, alamat, tanggalLahir, namaOrangTua, sekolah);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `nik`, `alamat`, `tanggalLahir`  adalah contoh atribut.

```bash
     String nama;
     String nik;
     String alamat;
     String tanggalLahir;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Penduduk(String nama, String nik, String alamat, String tanggalLahir) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

 public PendudukDewasa(String nama, String nik, String alamat, String tanggalLahir, String pekerjaan) {
        super(nama, nik, alamat, tanggalLahir);
        this.pekerjaan = pekerjaan;
    }

public PendudukAnak(String nama, String nik, String alamat, String tanggalLahir, String namaOrangTua, String sekolah) {
        super(nama, nik, alamat, tanggalLahir);
        this.namaOrangTua = namaOrangTua;
        this.sekolah = sekolah;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini,
    `setNama`,
     `setNik`,
     `setAlamat`,
      `setTanggalLahir`,
       mutator di class PendudukDewasa
       `setPEkerjaan`,
       mutator di class Pendudukanak
       `setOrangTua`,
        `setSekolah`
       adalah contoh method mutator.

```bash
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
    
     public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

     public void setNamaOrangTua(String namaOrangTua) {
        this.namaOrangTua = namaOrangTua;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNik`, `getAlamat`, `getTanggalLahir`, `displayInfo`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
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
        return "Nama: " + nama
                + "\nNIK: " + nik
                + "\nAlamat: " + alamat
                + "\nTanggal Lahir: " + tanggalLahir;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nama;
    private String nik;
    private String alamat;
    private String tanggalLahir;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PendudukAnak` `dan` `PendudukDewasa`  mewarisi `Penduduk` dengan sintaks `extends`.

```bash
public class PendudukAnak extends Penduduk {
    ...
}
public class PendudukDewasa extends Penduduk {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `PendudukAnak` `dan` `PendudukDewasa` merupakan override dari method `displayInfo` di `Penduduk`.

```bash
public String displayInfo() {
        return "Nama: " + nama
                + "\nNIK: " + nik
                + "\nAlamat: " + alamat
                + "\nTanggal Lahir: " + tanggalLahir;
    }

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam class method ` private static void tambahPenduduk(Scanner scanner)` `,` ` private static void tampilkanSemuaPenduduk()` , ` private static void cariPenduduk(Scanner scanner) ` lalu ` `seleksi `Switch` `di` `int pilihan = scanner.nextInt();` dalam class `PengelolaanPenduduk`.

```bash
public String getFakultas() {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Pengelolaan Data Penduduk ===");
            System.out.println("1. Tambah Data Penduduk");
            System.out.println("2. Tampilkan Semua Data Penduduk");
            System.out.println("3. Cari Penduduk Berdasarkan NIK");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1/2/3/4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            try {
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
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }

    private static void tambahPenduduk(Scanner scanner) {
        try {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIK: ");
            String nik = scanner.nextLine();
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

        for (Penduduk penduduk : daftarPenduduk) {
            if (penduduk.getNik().equals(nik)) {
                System.out.println("Data Penduduk Ditemukan:");
                System.out.println(penduduk.displayInfo());
                return;
            }
        }
        System.out.println("Penduduk dengan NIK " + nik + " tidak ditemukan.");
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 while (true) {
            System.out.println("=== Pengelolaan Data Penduduk ===");
            System.out.println("1. Tambah Data Penduduk");
            System.out.println("2. Tampilkan Semua Data Penduduk");
            System.out.println("3. Cari Penduduk Berdasarkan NIK");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1/2/3/4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
    ...
}
```bash
 for (Penduduk penduduk : daftarPenduduk) {
                System.out.println(penduduk.displayInfo());
                System.out.println("-----------------------");
            }
    ...
}
```

```bash
for (Penduduk penduduk : daftarPenduduk) {
            if (penduduk.getNik().equals(nik)) {
                System.out.println("Data Penduduk Ditemukan:");
                System.out.println(penduduk.displayInfo());
                return;
            }
        }
        System.out.println("Penduduk dengan NIK " + nik + " tidak ditemukan.");
    }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Mahasiswa:");
System.out.println(mahasiswa.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
   private static ArrayList<Penduduk> daftarPenduduk = new ArrayList<>();
```
```bash
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
```

```bash
 for (Penduduk penduduk : daftarPenduduk) {
            if (penduduk.getNik().equals(nik)) {
                System.out.println("Data Penduduk Ditemukan:");
                System.out.println(penduduk.displayInfo());
                return;
            }
        }
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```



## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Barizi
NPM: 2210010015
