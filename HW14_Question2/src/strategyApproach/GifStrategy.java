package strategyApproach;

public class GifStrategy extends UploadStrategy {
    @Override
    void upload(ImageFormat imageFormat) {
        System.out.println("uploading a Gif");
    }
}
