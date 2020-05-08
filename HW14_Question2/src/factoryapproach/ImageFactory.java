package factoryapproach;

public class ImageFactory {
    public static Image getImage(ImageFormat format) {
        if (format.equals(ImageFormat.PNG))
            return new PngImage();
        else if (format.equals(ImageFormat.GIF))
            return new GifImage();
        else if (format.equals(ImageFormat.JPG))
            return new JpgImage();
        else
            return null;
    }
}