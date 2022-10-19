public class Book {
    private final String nume;
    private String paragraph;
    private String image;
    private String table;

    public Book(String nume) {
        this.nume = nume;
    }

    public void createNewParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public void createNewImage(String image) {
        this.image = image;
    }

    public void createNewTable(String table) {
        this.table = table;
    }

    public void print() {
        System.out.println(nume);
        System.out.println(paragraph);
        System.out.println(image);
        System.out.println(table);
    }
}