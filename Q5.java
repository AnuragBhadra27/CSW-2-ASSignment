/*Q5. Create an ImageLibrary, which contains a set of image objects (from Q4) and
operations such as searching an image, inserting an image, and getting an image.
Create an ImageController class to manage the program execution and call the
methods to create and manipulate images. */

import java.util.ArrayList;
import java.util.List;

class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "Black";
    }

    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    @Override
    public String toString() {
        return "Image Width: " + imageWidth + " Image Height: " + imageHeight + " Color Code: " + colorCode;
    }
}

class ImageLibrary {
    private List<Image> images;

    public ImageLibrary() {
        images = new ArrayList<>();
    }

    public void insertImage(Image image) {
        images.add(image);
    }

    public Image searchImage(int imageWidth, int imageHeight, String colorCode) {
        for (Image image : images) {
            if (image.getImageWidth() == imageWidth && image.getImageHeight() == imageHeight && image.getColorCode().equals(colorCode)) {
                return image;
            }
        }
        return null;
    }

    public Image getImage(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        }
        return null;
    }
}

class ImageController {
    private ImageLibrary imageLibrary;

    public ImageController() {
        imageLibrary = new ImageLibrary();
    }

    public void execute() {
        Image img1 = new Image();
        Image img2 = new Image(1920, 1080, "White");

        imageLibrary.insertImage(img1);
        imageLibrary.insertImage(img2);

        System.out.println("Details of img1: " + img1.toString());
        System.out.println("Details of img2: " + img2.toString());

        Image searchResult = imageLibrary.searchImage(1920, 1080, "White");
        if (searchResult != null) {
            System.out.println("Search Result: " + searchResult.toString());
        } else {
            System.out.println("Image not found.");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        ImageController controller = new ImageController();
        controller.execute();
    }
}