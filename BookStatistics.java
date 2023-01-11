public class BookStatistics implements Visitor {
     int p = 0;
     int i = 0;
     int t = 0;
    int s = 0;



    @Override
    public void visitBook(Book book) {}
    @Override
    public void visitSection(Section section) {s++;}
   // @Override
    //public void visitT(TableOfContent table) {}
    @Override
    public void visitParagraph(Paragraph paragraph) { p++; }
    @Override
    public void visitTable(Table table) { t++; }
    @Override
    public void visitImageProxy(ImageProxy imageProxy) {}
    @Override
    public void visitImage(Image image) { i++; }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("* Number of images: " + i);
        System.out.println("* Number of tables: " + t);
        System.out.println("* Number of paragraphs: " + p);
    }
}