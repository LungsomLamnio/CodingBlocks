public class Main {
    public static void swap1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void swap2(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a + " b: " + b);
    }

    public static void swap3(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    public static void reverseArr(int arr[]) {
        int i = 0;
        int j = arr.length-1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

    public static void displayArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void init(int arr[], int newArr[]) {
        for(int i=0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
    }

    public static void leftShift(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void rightShift(int arr[]) {
        for(int i=arr.length-1; i>0; i--) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        displayArr(arr);
        rightShift(arr);
        displayArr(arr);
    }
}
