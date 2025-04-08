package Arrays;     // import this

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // Array Declearation
//        int arr[];
//        String []brr;    // both are the correct
//        arr = new int[10];  // size Declearation to the array
//        brr = new String[20];
//        // Initialization
//        int marks[] = {100,90,91,82,89};
//
//        System.out.println(arr.length);
//        System.out.println(marks.length);
//        System.out.println(brr.length);
//        System.out.println("Values  ");
//
////        for(int i=0; i<marks.length; i++ ) {
////            System.out.println(marks[i]);
////        }
//
////        for(int num:marks) {
////            System.out.println(num);
////        }
//        // sum of all values in the array
//        int sum = 0;
//        for(int num:marks) {
//            sum +=num;
//        }
//        System.out.println(sum);
//
//        long product = 1;
//        for(int num:marks) {
//            product *=num;
//        }
//        System.out.println(product);


   //       --------  taking input of array
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of Array  ");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int val = 0;
//        for(int i=0; i<size; i++) {
//            System.out.print("Enter the " + i  + " value of Array   ");
//            val = sc.nextInt();
//            arr[i] = val;
//        }
//        int mini =  Integer.MAX_VALUE;
//        for(int num:arr)
//            if(num < mini)
//                mini = num;
//        System.out.println("Minimum Value in the array is " + mini );
//
//        int maxi =  Integer.MIN_VALUE;
//        for(int num:arr)
//            if(num > maxi)
//                maxi = num;
//        System.out.println("Maximum Value in the array is " + maxi );


        // Adding all the values of Two-dimensional array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Rows  ");
        int row = sc.nextInt();
        System.out.print("Enter the size of the Cols  ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print("Enter the " + i + j + " Value  ");
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int []brr:arr) {    // here we create an brr array it store all the values of arr at index 0 in first iteration then it passes to the next for loop to iterate over it completely then it (first for loop) stores the 1st index of the arr (array) then next for loop iterate over till end similarly it run till first for loop ends (means when arr reach at last index null (after all iterations) then it stop execution.)
            for(int crr:brr) sum += crr;
        }
        System.out.println("Total sum is   " + sum);
        for(int i=0;i<row; i++) {
            System.out.print("[");
            for(int j=0; j<col; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("]");
            System.out.println();
        }
    sc.close();
    }
}