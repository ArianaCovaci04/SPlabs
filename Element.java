public interface Element {
    void print();

    void add(Element e);

    Element get(int n);

    void remove(Element e);

    void accept(Visitor v);

}