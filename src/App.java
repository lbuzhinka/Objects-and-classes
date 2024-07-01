public class App {
    public static void main(String[] args) {
        Author victorHugo = new Author("Виктор", "Гюго");
        Book lesMiserables = new Book("'Отверженные'", victorHugo,1867 );
        System.out.println("Автор: " + victorHugo.getAuthorsFirstName()  + victorHugo.getAuthorsLastName() + " произведение " + lesMiserables.getBookName() + ", год издания " + lesMiserables.getYearOfPublication());
        lesMiserables.setYearOfPublication(2020);
        System.out.println("Год последнего переиздания " + lesMiserables.getYearOfPublication());
        Author stephenKing = new Author("Стивен", "Кинг");
        Book misery = new Book("'Мизери'", stephenKing, 1987);
        System.out.println("Автор: " + stephenKing.getAuthorsFirstName() + " " + stephenKing.getAuthorsLastName() + " произведение " + misery.getBookName() + ", год издания " + misery.getYearOfPublication());
        misery.setYearOfPublication(1990);
        System.out.println("Год последнего переиздания " + misery.getYearOfPublication());


    }
}

