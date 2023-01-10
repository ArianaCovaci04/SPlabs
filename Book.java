public class Book extends Section {
    String Title;
    Author A;
    List<Author> authors = new ArrayList<>();
    List<Element> L = new ArrayList<>();

    public Book(String title) {
        super(title);
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void addAuthor(Author rpGheo) {
        A = rpGheo;
        authors.add(A);
    }

    public void getAuthor() {
        for (Author x :
                authors) {
            x.print();
        }

    }

    public void addContent(Paragraph paragraph) {
        L.add(paragraph);
    }

    public void addContent(Section section) {
        L.add(section);
    }

    public void addContent(Image image) {
        L.add(image);
    }

    public void addContent(Table table) {
        L.add(table);
    }

    public void print() {
        System.out.print(
                "Carte: " + Title + ",\n" +
                        " Autori: ");
        getAuthor();
        super.print();
    }
}