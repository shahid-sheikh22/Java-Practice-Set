import javax.swing.*;
import java.util.Scanner;

public class practiceSet6 {
    public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);
//        question 1: take 5 float element and add it

//        float []array ={5.0f,3.0f,8.0f,9.0f,5.0f};
//        float sum=0;
//        for (int i=0;i<5;i++){
//            sum=sum+array[i];
//        }
//        System.out.println(sum);

////      question 2: wap to find out whether a given integer is present in an array or not

//        int []element={5,5,2,6,8,4,6};
//        System.out.println("enter the element to find");
//        int find=sc.nextInt();
//        for (int i=0;i<element.length;i++){
//            if (find==element[i]){
//                System.out.println("found at location :"+(i+1));
//            }
//        }

//      question 3 : calculate the average marks from an array
//      containing marks of all students in Physics using for-each loop

//        float []marks={55f,88f,66f,99f,45f,55f};
//        float sum=0;
//        for (float element:marks) {
//            sum=sum+element;
//        }
//        System.out.println("sum is :"+sum);
//        float average=sum/marks.length;
//        System.out.println("average is:"+average);

        // question 4: wap to add two matrix of size 2*2

//        int[][] mat1 = new int[2][3];
//        int[][] mat2 = new int[2][3];
//        int [][] sum=new int[2][3];
//
//        //printing matrix 1
//        System.out.println("Enter the element in matrix 1");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                mat1[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(mat1[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
//        //printing matrix 2
//        System.out.println("Enter the element in matrix 2");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                mat2[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(mat2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

//        // adding arrays
//        System.out.println("the addition of array is :");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                    sum[i][j]=mat1[i][j]+mat2[i][j];
//                }
//            }
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 3; j++) {
//                    System.out.print(sum[i][j]);
//                    System.out.print(" ");
//
//                    }
//                System.out.println("");
//                }
        // question 5: wap to reverse an array

//        int []array={1,2,3,4,5,6};

        //using for loop
//        for (int i=5;i>=0;i--){
//            System.out.println(reverse[i]);
//        }

        //using swap-ing elements
//        int l=array.length;
//       int a= Math.floorDiv(l,2);
//        System.out.println("center of array is :"+a);
//        int temp;
//        for (int i=0;i<a;i++){
//            // swap-ing
//            temp=array[i];
//            array[i]=array[l-1-i];
//            array[l-1-i]=temp;
//
//        }
//        for (int element:array) {
//            System.out.print(element+" ");
//        }
        //question 6: find the maximum element in an array
//        int []array={1,2,34,4,5,6};
//        int max=0;
//        for (int i=0;i<array.length;i++){
//            if (max < array[i]){
//                max=array[i];
//            }
//        }
//        System.out.println("maximum element in array is :"+max);

        //question 7:find the minimum element in array

//        int []array={1,2,34,4,-5,6};
//        int min=0;
//        for (int i=0;i<array.length;i++){
//            if (min > array[i]){
//                min=array[i];
//            }
//        }
//        System.out.println("minimum element in array is :"+min);

        //question 8: whether array is sorted or not

        int []array={21,65,68,450,800,45};
        boolean isSorted = true;
        for (int i=0;i<5;i++){
           if (array[i]>array[i+1]){

               isSorted=false;
           break;
           }
           }
        if (isSorted){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("not sorted");
        }
        }
    }
