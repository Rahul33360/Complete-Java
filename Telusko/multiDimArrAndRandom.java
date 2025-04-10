

public class multiDimArrAndRandom {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        //  Assigning Value to arr
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        //  Printing values
        for(int array[]:arr) {
            for(int val:array) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
