public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Jan", "Kowalski", 35);
        System.out.println(author.toString());
        author.setSurname("Nowak");
        System.out.println(author.toString());
    }
}