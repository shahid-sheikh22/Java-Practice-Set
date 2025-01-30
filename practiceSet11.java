// Que 1 : Create an abstract clas Pen with methods write()
//         and refill() an abstract method

/*
abstract class pen{
    abstract void write();
    abstract void refill();
}
class pen1 extends pen{
    public void write(){
        System.out.println("Start writing ");
    }
    void  refill(){
        System.out.println("Refill the INK...");
    }
}
*/


// Que 2 : Use the pen class from Que 1 to create a concrete
//         class FoundationPen with additional method changeNib()

/*
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("Start writing");
    }
    void refill(){
        System.out.println("Refill the INK...");
    }
    void changeNib(){
        System.out.println("Change the Nib of pen");
    }
}*/


//Que 3 : Create a class Monkey with jump() and bite() methods.
//        Create a class Human which inherits this Monkey class and
//        implement BasicAnimal interface with eat() and step() method.

/*
class Monkey{
    void jump(){
        System.out.println("Jumping Jumping");
    }
    void bite(){
        System.out.println("Bite the food");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("I am eating");
    }
    public void sleep(){
        System.out.println("Sleeping Time");
    }
}
*/

// Que 4 : Create a Telephone with ring() and lift() and disconnect()
//         methods as abstract class SmartTelephone and demonstrate
//         polymorphism.

/*
abstract class Telephone{
    abstract void ring();
    abstract void lift();
}
class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Telephone is ringing");
    }
    void lift() {
        System.out.println("Lift the call");
    }
    void reject(){
        System.out.println("Call is rejected");
    }
}
 */

//Que 5 : Demonstrate polymorphism using Monkey class from Que 3
/*
class Monkey{
    void jump(){
        System.out.println("Jumping Jumping");
    }
    void bite(){
        System.out.println("Bite the food");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("I am eating");
    }
    public void sleep(){
        System.out.println("Sleeping Time");
    }
}
 */


//Que 6: Create an interface TVRemote and use it to inherit another
//       interface SmartTVRemote
interface tvRemote{
   void offButton();
   void changeChannel();
   void volume();
}

interface smartTvRemote extends tvRemote{
    void wifi();
}
class tv implements smartTvRemote{
    public void wifi(){
        System.out.println("Connect to wifi");
    }
    public void offButton(){
        System.out.println("turn off tv");
    }
    public void changeChannel(){
        System.out.println("Channel Changed");
    }
    public void volume(){
        System.out.println("Volume increase/decrease");
    }
}

public class practiceSet11 {
    public static void main(String[] args) {
//      Que 1 :
//        pen1 p =new pen1();
//        p.write();p.refill();

//      Que 2 :
//        FountainPen f=new FountainPen();
//        f.write();f.refill();f.changeNib();

//      Que 3:
//        Human h= new Human();
//        h.eat();h.sleep();h.bite();h.jump();

//      Que 4:
//        Telephone t= new SmartTelephone();
//        t.ring();
//        t.lift();
////      t.reject();    //will show error because reference is of only Telephone , so that class method will only execute
//
//        SmartTelephone st=new SmartTelephone();
//        st.reject();       // here all methods will execute

//      Que 5:
//        Monkey m= new Human();
//        m.jump();
//        m.bite();
////      m.eat();  //will show error because reference is of only Monkey , so that class method will only execute
//        Human h=new Human();
//        h.eat();
//        h.sleep();

//      Que 6:
          tv t=new tv();
          t.changeChannel();
          t.offButton();
          t.wifi();
          t.volume();

    }
}
