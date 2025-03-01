/*Q4. Write a program to create an Image class with attributes imageWidth, imageHeight,
and colorCode. Add the required constructor, set methods, get methods, and toString
method. Create the object of the image class using the default and parameterized
onstructor and print the details of the object. */
class Image{
    private int imageWidth;
    private int imageHeight;
    private String colorCode;
    public Image(){
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "Black";
    }
    public Image(int imageWidth, int imageHeight, String colorCode){
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }
    public void setImageWidth(int imageWidth){
        this.imageWidth = imageWidth;
    }
    public void setImageHeight(int imageHeight){
        this.imageHeight = imageHeight;
    }
    public void setColorCode(String colorCode){
        this.colorCode = colorCode;
    }
    public int getImageWidth(){
        return imageWidth;
    }
    public int getImageHeight(){
        return imageHeight;
    }
    public String getColorCode(){
        return colorCode;
    }
    public String toString(){
        return "Image Width: "+imageWidth+" Image Height: "+imageHeight+" Color Code: "+colorCode;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Image img1 = new Image();
        Image img2 = new Image(1920, 1080, "White");
        System.out.println("Details of img1: "+img1.toString());
        System.out.println("Details of img2: "+img2.toString());
    }
    
}
