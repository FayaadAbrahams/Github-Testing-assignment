package za.ac.cput.shapeform;

//Student Name - Fayaad Abrahams 
//Student Number - 218221630
public class Cylinder {

    private String radius;
    private int height;

    public Cylinder() {

    }

    @Override
    public String toString() {
        return "The height is: " + height + " and the radius is: " + radius;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
