package strategyApproach;

public class PngStrategy extends UploadStrategy {
    @Override
    void upload(ImageFormat imageFormat) {
        System.out.println("uploading a Png");
    }

}
