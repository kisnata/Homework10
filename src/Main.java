public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Иван", "Тургенев");

        Book book = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Муму", author2, 1852);

        book.setYearPublishing(1850);
        System.out.println(book.getTitle() + ", " + book.getYearPublishing() + ", " + book.getAuthor().getSurname() + " " + book.getAuthor().getName());
        System.out.println(book2.getTitle() + ", " + book2.getYearPublishing() + ", " + book2.getAuthor().getSurname() + " " + book2.getAuthor().getName());
    }
}