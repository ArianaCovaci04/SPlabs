public class Section implements Element {
    String Title;
    List<Element> L = new ArrayList();
    Paragraph P;
    Image I;
    Table T;

    public Section(String title) {
        Title = title;
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
        v.visitSection(this);
    }

    @Override
    public void print() {
        System.out.println(Title);
        L.stream().forEach(e -> e.print());
    }
}