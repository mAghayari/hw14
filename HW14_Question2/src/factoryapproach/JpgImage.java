package factoryapproach;

public class JpgImage implements Image {
    @Override
    public void print() {
        System.out.println("This is a .jpg image");
    }
}