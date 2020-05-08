package factoryapproach;

public class PngImage implements Image {
    @Override
    public void print() {
        System.out.println("This is a .png image");
    }
}