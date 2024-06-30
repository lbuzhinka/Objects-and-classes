public class Book {
   private String bookName;
   static Author author;
   private int yearOfPublication;
   private Book(String bookName, Author author, int yearOfPublication) {
      this.bookName = bookName;
      this.author = author;
      this.yearOfPublication = yearOfPublication;
   }

    public static Book createBook(String bookName,  int yearOfPublication) {
        return new Book(bookName, author, yearOfPublication);
    }
    public String getBookName () {
      return this.bookName;
   }

   public int getYearOfPublication () {
      return this.yearOfPublication;
   }
   public void setYearOfPublication(int yearOfPublication) {
      this.yearOfPublication = yearOfPublication;
   }
}
