// question 1: create a class cylinder and use getters and setters to set its radius and height
// question 2: use 1 to calculate surface area and volume of cylinder
class cylinder {
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
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }

    public double volume(){
        return 3.14*radius*radius*height;
    }

    public double area(){
        return 2*3.14*radius*height;
    }
}

public class practiceSet9 {
    public static void main(String[] args) {

        cylinder shahid=new cylinder();


 
    shahid.setHeight(5);
    int h=shahid.getHeight();
    System.out.println(h);

    shahid.setRadius(5);
    int r=shahid.getRadius();
    System.out.println(r);

    double sur_area = shahid.surfaceArea();
    System.out.println(sur_area);

    double area = shahid.area();
    System.out.println(area);

    double volume = shahid.volume();
    System.out.println(volume);
    }
}
