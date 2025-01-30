//public class practiseSet7 {
//    // question 1 : table using methods
////    static void table(int x){
////
////        for (int i=1;i<=10;i++){
////            int sum = x*i;
////            System.out.printf("%d*%d=%d\n",x,i,sum);
////        }
////    }
//
//    // question 2 :print a pattern
////        *
////        **
////        ***
////        ****
////    static void pattern(int x){
////
////        for (int i=0;i<x;i++){
////
////            for (int j=0;j<=i;j++){
////                System.out.print("*");
////            }
////            System.out.println(" ");
////        }
////    }
//
////    question 3 : recursive function to calculate sum
////    static int sum(int x){
////        int sum = 0;
////        if (x==1){
////            return 1;
////        }
////            return x+sum(x-1);
//
////        System.out.println(sum);
////    }
//
//
////      question 4 :print a pattern
////        ****
////        ***
////        **
////        *
//    static void pattern2(int x){
//
//        for (int i=0;i<=x;i++){
//
//            for (int j=x-i;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    //question 5 : Fibonacci Series
////    static int fibo(int x){
////        if (x==1){          //if(x==1 || x==2)   return x-1;
////            return 0;
////        }
////        else if (x==2){
////            return 1;
////        }
////        else {
////            return fibo(x-2) + fibo(x - 1);
////        }
////    }
//    // question 6 : find the average of set pf number passed as arguments
//
////    static int average(int...arr){
////        int sum=0;
////        for (int i=0;i<arr.length;i++){
////            sum+=arr[i];
////        }
////        int avg=sum/arr.length;
////        return avg;
////    }
//
//    //question 8 :
////    static void pattern_rec(int x){
////        if (x>0){
////            pattern_rec(x-1);
////            for (int i=0;i<x;i++){
////                System.out.print("*");
////            }
////            System.out.println();
////        }
////    }
////
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
//
//        // question 1 :
////        System.out.println("Enter the no. for table");
////        int n = sc.nextInt();
////        table(n);
//
//        // question 2 :
////        System.out.println("Enter the no. for pattern");
////        int n = sc.nextInt();
////        pattern(n);
//
////        question 3 :
////        System.out.println("Enter the no. for their sum :");
////        int n = sc.nextInt();
////        int c=sum(n);
////        System.out.println(c);
//
//        // question 4 :
////        System.out.println("Enter the no. for their pattern :");
////        int n = sc.nextInt();
////        pattern2(n);
//
//        //question 5 :
////        System.out.println("Enter the no. for fibonacci series :");
////        int n = sc.nextInt();
////        int c=fibo(n);
////        System.out.println(c);
//
//        // question 6 :
////        System.out.println("Enter the size of array :");
////        int a=sc.nextInt();
////        int []n = new int[a];
////        int sum=0;
////        System.out.println("Enter the element of array");
////        for (int i=0;i<a;i++){
////             n[i]=sc.nextInt();
////        }
////        for (int i=0;i<a;i++){
////            sum+=n[i];
////        }
////        float avg=sum/n.length;
////        System.out.println(avg);
////
//        //question 8 :pattern using recursion
////        System.out.println("Enter the no. for printing pattern :");
////        int n = sc.nextInt();
////        pattern_rec(n);
//
//    }
//}
