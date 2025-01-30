
// question 1 : create a method for employee
//class Employee{
//    String name;
//    int salary;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String n){
//        name=n;
//    }
//}
//public class practiceSet8 {
//    public static void main(String[] args) {
//        Employee shahid=new Employee();
//
//        shahid.setName("Shahid");
//        System.out.println(shahid.getName());
//        shahid.salary=500000;
//        System.out.println(shahid.getSalary());
//        // System.out.println("hello");
//    }
//
//}

//question 2: create and call methods of cellPhone
//public class practiceSet8{
//    public static void main (String[] args) {
//        cellPhone mob1 = new cellPhone();
//        mob1.ringing();
//        mob1.vibrating();
//        mob1.calling();
//    }
//}
//
//class cellPhone{
//    public void ringing(){
//        System.out.println("ringing");
//    }
//
//    public void vibrating(){
//        System.out.println("vibrating");
//    }
//
//    public void calling(){
//        System.out.println("calling");
//    }
//
//}

import java.util.Scanner;

//question 3: create a class square with the methods to initialize its side,calculate area,perimeter
//public class practiceSet8 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the side length of square ");
//        int a =sc.nextInt();

//        square sq=new square();
//        sq.n=55;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
//
//    }
//}
//class square{
//    int n;
//    public int side(){
//        return n;
//    }
//    public int area(){
//        return n*n;
//    }
//    public int perimeter(){
//        return 4*n;
//    }
//}
public class practiceSet8 {
    public static void main(String[] args) {
    tommy p1=new tommy();
    p1.fire();
    p1.run();
    p1.hit();
    }
}
class tommy{

    public void hit(){
        System.out.println("hitting");
    }

    public void run(){
        System.out.println("running");
    }

    public void fire(){
        System.out.println("firing");
    }
}
