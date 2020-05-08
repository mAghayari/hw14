package strategyApproach;

public class StrategyMain {
    public static void main(String[] args) {
        Uploader uploader = new Uploader();
        uploader.setImageFormat(ImageFormat.PNG);
        uploader.uploading();
    }
}
