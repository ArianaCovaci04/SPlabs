public class Image implements Element {
    String ImageName;
    String Url;
    ImageContent Content;
    List<Element> L = new ArrayList();

    public Image(String url) {

        Url = url;
    }

    public ImageContent Content(){
        return null;
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
        v.visitImage(this);
    }

    @Override
    public void print() {
        System.out.println(ImageName);
        L.stream().forEach(e -> e.print());
    }
}