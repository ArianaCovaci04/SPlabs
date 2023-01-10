public class Paragraph implements Element {
    String Text;
    List<Element> L = new ArrayList();

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Paragraph(String text) {
        Text = text;
    }

    @Override
    public void add(Element e) {

        L.add(e);
    }

    @Override
    public Element get(int n) {
        Element e = null;
        for (int i = 0; i < L.size(); i++) {
            if (i == n)
                e = L.get(i);
            break;
        }
        return e;
    }

    @Override
    public void remove(Element e) {
        for (int i = 0; i < L.size(); i++) {
            if (L.get(i) == e)
                L.remove(e);
        }

    }

    @Override
    public void accept(Visitor v) {
        for (Element e : this.L) {
            e.accept(v);
        }
    }

    @Override
    public void print() {
        System.out.println(Text);
    }

    public void setAlignStrategy(AlignCenter alignCenter) {
    }
    public void setAlignStrategy(AlignRight alignRight) {
    }public void setAlignStrategy(AlignLeft alignLeft) {
    }

}