// Que : Write a program to print Good Morning and
// Welcome using Thread and then add a sleep method on welcome class

class myTh extends Thread{
    public void run(){

        for(int i=0;i<20;i++) {
           try {
               Thread.sleep(2000);
           }catch(Exception e){
               System.out.println(e);

           }
            System.out.println("Good Morning");
        }
    }
}

class myTh1 extends Thread{
    public void run(){
        for(int i=0;i<20;i++) {
            try {
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);

            }
            System.out.println("Welcome");
        }
    }
}


public class practiceSet13 {
    public static void main(String[] args) {
        myTh t1=new myTh();
        myTh1 t2=new myTh1();
//        t1.start();
//        t2.start();
        System.out.println(t2.getState());
        System.out.println(t1.getState()); // it tells whether thread is runnable or new

        System.out.println(Thread.currentThread().getName()); //if thread is unknown & we have to find whether thread is runnable or not then use currentThread()
        System.out.println(Thread.currentThread().getState()); 
    }
}
