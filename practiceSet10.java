class circle{

    public int radius;

    circle(int r){
        System.out.println("i am circle class constructor");
        this.radius=r;
    }

    public double area(){
        return this.radius*this.radius*Math.PI;
    }
}

class Cylinder extends circle{
    public int height;
    Cylinder(int h,int r){
        super(r);
        System.out.println("i am cylinder constructor");
        this.height=h;

    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class practiceSet10 {
    public static void main(String[] args) {
//        circle c=new circle(2);
        Cylinder c1=new Cylinder(2,5);
        System.out.println(c1.volume());
    }
}
