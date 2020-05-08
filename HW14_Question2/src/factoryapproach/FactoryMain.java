package factoryapproach;

public class FactoryMain {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage(ImageFormat.GIF);
        image.print();
    }
}