public class Book {
   private String bookName;
   private Author author;
   private int yearOfPublication;
   Book(String bookName, Author author, int yearOfPublication) {
      this.bookName = bookName;
      this.author = author;
      this.yearOfPublication = yearOfPublication;
   }

    public Author getAuthor() {
        return this.author;
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
