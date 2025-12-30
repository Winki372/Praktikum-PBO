class LibrarySystem{
    class BookData{
        void showData(Book buku){
        System.out.println("Judul Buku: " + buku.title);
        System.out.println("Biaya Pinjam: " + buku.getBorrowCost());
        System.out.println("Judul Buku: " + buku.calculatePenalty(3));
        }
    }
    
    public static void main(String[] args){
    Book buku = new Book("Pemrograman Java", 5000);
    LibrarySystem.BookData Data = new LibrarySystem().new BookData();
    
    Data.showData(buku);
    }
}