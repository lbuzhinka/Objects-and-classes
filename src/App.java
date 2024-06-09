public class App {
    public static void main(String[] args) {
        Author victor_hugo = new Author("Виктор", "Гюго");
        Book lesMiserables = new Book("'Отверженные'", 1862);
        System.out.println("Автор: " + victor_hugo.getAuthorsFirstName() + ", " + victor_hugo.getAuthorsLastName() + " произведение " + lesMiserables.getBookName() + ", год издания " + lesMiserables.getYearOfPublication());
        lesMiserables.setYearOfPublication(2020);
        System.out.println("Год последнего переиздания " + lesMiserables.getYearOfPublication());
        Author stephen_king = new Author("Стивен", "Кинг");
        Book misery = new Book("'Мизери'", 1987);
        System.out.println("Автор: " + stephen_king.getAuthorsFirstName() + " " + stephen_king.getAuthorsLastName() + " произведение " + misery.getBookName() + ", год издания " + misery.getYearOfPublication());
        misery.setYearOfPublication(1990);
        System.out.println("Год последнего переиздания " + misery.getYearOfPublication());


    }
}

