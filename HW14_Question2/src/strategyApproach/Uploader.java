package strategyApproach;

public class Uploader {
    private ImageFormat imageFormat;

    public void setImageFormat(ImageFormat imageFormat) {
        this.imageFormat = imageFormat;
    }

    public void uploading() {
        if (imageFormat.equals(ImageFormat.GIF)) {
            GifStrategy gifStrategy = new GifStrategy();
            gifStrategy.upload(imageFormat);
        } else if (imageFormat.equals(ImageFormat.JPG)) {
            JpgStrategy jpgStrategy = new JpgStrategy();
            jpgStrategy.upload(imageFormat);
        } else if (imageFormat.equals(ImageFormat.PNG)) {
            PngStrategy pngStrategy = new PngStrategy();
            pngStrategy.upload(imageFormat);
        }
    }
}
