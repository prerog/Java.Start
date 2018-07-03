import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    private static double setLimit(double colorComponent) {
        final int MIN_RGB = 0;
        final int MAX_RGB = 255;

        if (colorComponent < MIN_RGB) {
            return MIN_RGB;
        } else if (colorComponent > MAX_RGB) {
            return MAX_RGB;
        } else {
            return colorComponent;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);

        WritableRaster inputRaster = image.getRaster();
        WritableRaster outputRaster = newImage.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;
        double[] pixel = new double[COLORS_COUNT_IN_RGB];
        double[] aroundPixel = new double[COLORS_COUNT_IN_RGB];

        int arraySize = 3;
        double blurEffect = 1.0 / 9.0;
        double[][] blurArray = new double[arraySize][arraySize];

        for (int i = 0; i < blurArray.length; i++) {
            for (int j = 0; j < blurArray.length; j++) {
                blurArray[i][j] = blurEffect;
            }
        }

        int width = inputRaster.getWidth();
        int height = inputRaster.getHeight();
        int arrayHalfSize = arraySize / 2;

        for (int j = arrayHalfSize; j < height - arrayHalfSize; j++) {
            for (int i = arrayHalfSize; i < width - arrayHalfSize; i++) {
                inputRaster.getPixel(i, j, pixel);

                double redComponent = 0;
                double greenComponent = 0;
                double blueComponent = 0;

                for (int r = j - arrayHalfSize, m = 0; r <= j + arrayHalfSize; r++, m++) {
                    for (int p = i - arrayHalfSize, n = 0; p <= i + arrayHalfSize; p++, n++) {
                        inputRaster.getPixel(p, r, aroundPixel);

                        redComponent += aroundPixel[0] * blurArray[m][n];
                        greenComponent += aroundPixel[1] * blurArray[m][n];
                        blueComponent += aroundPixel[2] * blurArray[m][n];
                    }
                }
                pixel[0] = setLimit(redComponent);
                pixel[1] = setLimit(greenComponent);
                pixel[2] = setLimit(blueComponent);

                outputRaster.setPixel(i, j, pixel);
            }
        }
        ImageIO.write(newImage, "png", new File("blurOut.png"));
    }
}
