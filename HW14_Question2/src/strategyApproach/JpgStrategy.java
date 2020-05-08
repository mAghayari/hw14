package strategyApproach;

public class JpgStrategy extends UploadStrategy {
    @Override
    void upload(ImageFormat imageFormat) {
        System.out.println("uploading a Jpg");
    }

}
