public class ImageProxy implements  Element{

    String Url;
    Image realImage;

    public ImageProxy(String url) {
        Url = url;
    }

    public Image loadImage(){

        if(realImage == null)
           realImage= new Image(Url);
        return realImage;
    }
    @Override
    public void print() {

    }

    @Override
    public void add(Element e) {

    }

    @Override
    public Element get(int n) {
        return null;
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void accept(Visitor v) {

    }
}