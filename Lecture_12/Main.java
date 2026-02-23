public class Main {
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int minIndx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndx]) {
                    minIndx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int item = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > item) {
                arr[j+1] = arr[j];
                arr[j] = item;
                j--;
            }
        }
    }

    public static void displayArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,5,3,2,1};
        displayArray(arr);
        insertionSort(arr);
        displayArray(arr);
    }
}
