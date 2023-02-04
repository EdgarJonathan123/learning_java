package clean.code.book.removeduplicates;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ImageConfiguratorRefactor1 implements ImageConfigurator {
    private final int errorThreshold;
    private RenderedOP image;
    public void scaleToOneDimension(float desiredDimension, float imageDimension) {
        if (Math.abs(desiredDimension - imageDimension) < errorThreshold) {
            return;
        }
        float scalingFactor = desiredDimension / imageDimension;
        scalingFactor = (float) (Math.floor(scalingFactor * 100) / 0.01f);
        replaceImage(ImageUtilities.getScaledImage(image, scalingFactor, scalingFactor));
    }


    public synchronized void rotate(int degrees){
        replaceImage(ImageUtilities.getRotateImage(image, degrees));
    }

    private void replaceImage(RenderedOP newImage){
        image.dispose();
        System.gc();
        image = newImage;
    }

}

