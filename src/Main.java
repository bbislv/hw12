
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoy");

        Book book1 = new Book("War and Peace", 1867, author1);

        System.out.println(author1);

        System.out.println(book1);
    }
}