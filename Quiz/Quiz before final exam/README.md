Quiz pratikum yang diadakan sebelum UAS Pemrograman Beriorientasi Objek Sistem Informasi FKI UMS Semester 3
##
> [!NOTE]
> **nb: Quiz ini dibuat berdasarkan aslab dan dosen pengampu masing-masing**
##
Studi Kasus: Perpustakaan Sederhana
Sebuah perpustakaan ingin membuat program sederhana untuk menghitunf biaya peminjaman buku dan denda keterlambatan

1. **Class**
   a. buat sebuah **interface Penalty** yang digunakan untuk menghitung denda keterlambatan peminjaman buku, yang memiliki satu method: double calculatePenalty(int lateDays);
   b. buat **abstract class** bernama **LibraryItem** yang mewakili item di perpustakaan, memiliki:
     - Atribut title untuk menyimpan judul item,
     - Method abstrak getBorrowCost() untuk menghitung biaya peminjaman
   c. Buat **class Book** yang merepresentasikan buku
     - Merupakan turuna dari LibraryItem dan mengimplementasikan method getBorrowCost()
     - Memilikii atribut pricePerDay sebagai biaya pinjam perhari
  
2. **Nested Class**
   Buaty class utama bernama LibrarySystem ssebegai pengelola sistem.
   Di dalam class tersebut, buat **nested class** BookData yang berfungsi untuk:
      - Menyimpan data buku
      - Menampilkan judul buku dan biaya peminjaman
  
3. Method Main
   Pada method main, lakukan langka berikut:
      a. Buat satu objek Book
      b. Gunakan nested class untuk menampilkan data buku
      c. Tampilkan:
         - Biaya peminjaman buku
         - Denda keterlambatan jika buku terlambat dikembalikan beberapa hari


> [!IMPORTANT]
> ```
> Judul Buku: Pemrograman Java
> Biaya Pinjam: 5000.0
> Denda Keterlambatan: 3000.0
> ```
