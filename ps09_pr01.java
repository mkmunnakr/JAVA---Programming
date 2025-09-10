//  Surface area and volume of the cylinder
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return (2* Math.PI* radius * radius + 2*Math.PI*radius*height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class ps09_pr01 {
    public static void main(String[] args) {
        Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(12);
        System.out.print("Height is : ");
        System.out.println(mycylinder.getHeight());
        System.out.print("Radius is : ");
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
        System.out.print("Total Surface Area is : ");
        System.out.println(mycylinder.surfaceArea());
        System.out.print("Volume is : ");
        System.out.println(mycylinder.volume());
    }
}
