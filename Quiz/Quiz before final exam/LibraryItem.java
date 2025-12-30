abstract class LibraryItem{
String title;
    
LibraryItem(String title){
this.title = title;}

abstract double getBorrowCost();
}