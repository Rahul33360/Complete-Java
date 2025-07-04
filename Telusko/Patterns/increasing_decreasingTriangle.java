package Patterns;

import java.util.Scanner;

public class increasing_decreasingTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    ///  increasing
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
/*
    for n = 5.
    output:
        *
        * *
        * * *
        * * * *
        * * * * *
*/
        ///     decreasing

//        for(int i=0; i<n; i++) {
//            for(int j=i; j<n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
/*
    for n = 5:
    output:
        * * * * *
        * * * *
        * * *
        * *
        *
*/

        ///  right side increasing triangle
        /*
        for(int i=0; i<=n; i++) {
            // spces
            for(int j=i; j<=n; j++) {
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++)
                System.out.print(" *");
            System.out.println();
        }
*/
/*      for n=5 output:
           *
         * *
       * * *
     * * * *
   * * * * *
*/

        ///  right side decreasing triangle
/*
        for(int i=0; i<=n; i++) {
            // prints the triangle of spaces
            for(int k=1; k<=i; k++)
                System.out.print("  ");
            // prints the triangle of stars
            for(int j=i; j<=n; j++)
                System.out.print(" *");

            System.out.println();
        }
*/

/*      for n=5 OUTPUT:
         * * * * * *
           * * * * *
             * * * *
               * * *
                 * *
                   *
*/

        ///     Hill increasing pattern
/*
        for(int i=1; i<=n; i++) {
             for (int j=i; j<n; j++)
                 System.out.print("  ");
             for (int j=1; j<i; j++)
                 System.out.print("* ");
             for (int j=1; j<=i; j++)
                 System.out.print("* ");
            System.out.println();
        }
  */
/*          for n=5 output:

                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
*/

        ///  Hill Decreasing or Reverse pattern
/*

        for(int i=1; i<=n; i++) {
            for(int j=1; j<i; j++)
                System.out.print("  ");
            for (int j=i; j<n; j++)
                System.out.print("* ");
            for(int j=i; j<=n; j++)
                System.out.print("* ");
            System.out.println();
        }
*/
/*
        for n=5 output:
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
*/
        ///  Diamond Pattern

        // upper half
        for (int i=1; i<=n; i++) {
            for(int j=i; j<n; j++)
                System.out.print("  ");
            for (int j=1; j<i; j++)
                System.out.print("* ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        // lower half
        for (int i=2; i<=n; i++) {
            for (int j=1; j<i; j++)
                System.out.print("  ");
            for (int j=i; j<n; j++)
                System.out.print("* ");
            for (int j=i; j<=n; j++)
                System.out.print("* ");
            System.out.println();
        }

/*
        for n=5 output:
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
*/


    }
}
