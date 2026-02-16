import java.util.ArrayList;

public class firstClass {
    public static void add(int n1, int n2) {
        System.out.println("Addition: " + n1+n2);
    }

    public static int add2(int n1, int n2) {
        return n1+n2;
    }

    public static void oddEven(int n) {
        System.out.println(n%2 == 0);
    }

    public static boolean oddEven2(int n) {
        return n%2 == 0;
    }

    public static void maxNum(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    public static int maxNum2(int a, int b) {
        return Math.max(a, b);
    }

    public static int maxNum3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int sumOfN(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) sum+=i;
        return sum;
    }

    public static float simpleInterest(int p, int r, int t) {
        return (p*r*t) / 100;
    }

    public static int reverseNum(int num) {
        int reverse = 0;
        while(num > 0) {
            int lastDigit = num%10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }

        return reverse;
    }

    public static void printEven(int n) {
        for(int i=2; i<=n; i+=2) System.out.print(i + " ");
        System.out.println();
    }

    public static ArrayList<Integer> printEven2(int n) {
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i=2; i<=n ; i+=2) {
            sum.add(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(printEven2(1000));
    }
}
