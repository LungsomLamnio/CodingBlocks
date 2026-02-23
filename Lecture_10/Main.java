import java.util.Scanner;

public class Main {
    public static void displayArr(int arr[]) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static boolean binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            int mid = (right - left) + left / 2;

            if(mid == target) {
                return true;
            } else if(mid < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static boolean linearSearch(int arr[], int target) {
        for(int i=0, j=arr.length-1; i<arr.length/2; i++,j--) {
            if(arr[i] == target || arr[j] == target) {
                return true;
            }
        }

        return false;
    }

    public static void init(int arr[]) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    public static void maxMin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    public static void main(String[] args) {
        int arr[] = new int[5];

        init(arr);
        displayArr(arr);
        // System.out.println(linearSearch(arr, 5));
        maxMin(arr);
    }
}
