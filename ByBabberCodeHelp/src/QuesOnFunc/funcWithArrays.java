package QuesOnFunc;

public class funcWithArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1,22,34};    // []arr = ... both are same
        printArray(arr);
        int sum = sumArr(arr);
        System.out.println();
        System.out.println(sum);
        arrManipulate(arr);
        for(int i:arr) {
            System.out.print(i + " ");
        }
    return;
    }
    public static int printArray(int []arr) {
        for (int a:arr)
            System.out.print( a + " " );
    return 0;
    }
    public static int sumArr(int arr[]) {
        int sum = 0;
        for(int a:arr) {
            sum +=a;
        }
        return sum;
    }
    // array manipulation
    public static void arrManipulate(int []args) {
        int len = args.length;
        for(int i=0; i<len; i++) {
            args[i] = 2*args[i];
        }
    return ;
    }
}
