
package za.ac.cput.shapeforms;

public class Triangle {
        private double hight;
    private double base;
    private int side1,side2,side3;
    private String area = "2/(b*h)";
    private String parimeter = "side1 + side2 + side3";

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getParimeter() {
        return parimeter;
    }

    public void setParimeter(String parimeter) {
        this.parimeter = parimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" + "area=" + area + ", parimeter=" + parimeter + '}';
    }
    
}
