import java.util.Scanner;

public class practiceSet4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
////        //problem 1
//
////        int a=10;
////        if(a=17){ //here assignment operator is used so program will throw error
////            System.out.println("hello");
////        }
////        else
////            System.out.println("no hello");
//
////        //problem 2
//
////        System.out.println("enter marks of subject 1");
////        float m1=sc.nextFloat();
////        System.out.println("enter marks of subject 2");
////        float m2=sc.nextFloat();
////        System.out.println("enter marks of subject 3");
////        float m3=sc.nextFloat();
////        float sum=m1+m2+m3;
////        System.out.println("Sum is :"+sum);
////        float percent=sum*100/300;
////        if(percent>=40 && m1 >=33 && m2>=33 && m3>=33){
////            System.out.println("u passed with "+percent+"%");
////        }
////        else {
//////            if (percent>=40)
//////            System.out.println("u passed with "+percent);
//////            else
//////                System.out.println("u failed");
////            System.out.println("not promoted");
////       }
//        //problem 3 find taxes
//        System.out.println("enter your income : ");
//        float income=sc.nextFloat();
//        double tax=0;
//        if (income<2.5){
//            System.out.println("Your tax is :"+tax+0);
//        }
//        if (2.5d< income && income <= 5.0d){
////            tax=tax+0.05f*(income-2.5f);
//            System.out.println("Your tax is :"+(tax + 0.05d*(income-2.5d))*100000+" rupees");
//        }
//        if (5.0d< income && income <= 10.0d){
//                tax=tax+0.05d*(5.0d-2.5d)*100000;
//                tax=tax+0.2d*(income-5.0d)*100000;
//            System.out.println("Your tax is :"+tax+" rupees");
//        }
//        if (10.0f< income && income <= 20.0d){
//            tax=tax+0.05f*(5.0d-2.5d)*100000;
//            tax=tax+0.2*(10.0d-5.0d)*100000;
//            tax=tax+0.3d*(income-10.0d)*100000;
//            System.out.println("Your tax is :"+tax+" rupees");
//        }
//        problem 5
//        float leap=sc.nextFloat();
//        if (leap%400==0 && leap%100==0){
//            System.out.println("it is a leap year");
//        }
//        else
//            System.out.println("not a leap year");

        //problem 6
        System.out.println("Enter your site name :");
        String web=sc.nextLine();

        if (web.endsWith(".com")) {
            System.out.println("commercial website");
        }
        else if (web.endsWith(".org")) {
            System.out.println("organizational website");
        }
        else if (web.endsWith(".in")) {
            System.out.println("Indian website");
        }
        else
            System.out.println("Pirated website");
          }
    }

