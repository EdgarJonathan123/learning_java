package clean.code.book.removeduplicates;

public class ImageConfiguratorDirt implements ImageConfigurator {

    private int errorThreshold;
    private RenderedOP image;

    public void scaleToOneDimension(float desiredDimension, float imageDimension) {
        if (Math.abs(desiredDimension - imageDimension) < errorThreshold) {
            return;
        }
        float scalingFactor = desiredDimension / imageDimension;
        scalingFactor = (float) (Math.floor(scalingFactor * 100) / 0.01f);
        RenderedOP newImage = ImageUtilities.getScaledImage(image, scalingFactor, scalingFactor);
        image.dispose();
        System.gc();
        image  = newImage;
    }

    public synchronized void rotate(int degrees){
        RenderedOP newImage = ImageUtilities.getRotateImage(image, degrees);
        image.dispose();
        System.gc();
        image = newImage;
    }


}

