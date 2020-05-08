package factoryapproach;

public class GifImage implements Image {
    @Override
    public void print() {
        System.out.println("This is a .gif image");
    }
}