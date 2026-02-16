public class Main {
    public static int reverseNumber(int num) {
        int reverse = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }

        return reverse;
    }

    public static int findFact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return n * findFact(n-1);
    }

    public static void findGCD(int n1, int n2) {
        int max = Integer.MIN_VALUE;

        int n = n1 > n2 ? n2 : n1;

        for(int i=2; i<=n; i++) {
            if(n1%i == 0 && n2%i == 0) {
                max = Math.max(max, i);
            }
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + max);
    }

    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void findPrime(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void primeFactors(int n) {
        for(int i=2; i<=n; i++) {
            if((n%i == 0) && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            for(int k=0; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        int star = 2*n-1;
        int space = 0;
        int row = 1;

        while(row <= n) {

        }
    }

    public static void pattern3(int n) {
        for(int i=1; i<=n; i++) {
            // space
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            // numbers
            for(int j=1; j<=i*2-1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // int count = 1;
        // int space = n - 1;
        // int row = 1;

        // while(row <= n) {
        //     int i = 1;
        //     while(i <= space) {
        //         System.out.print(" ");
        //     }

        //     int j = 1;
        //     while(j <= count) {
        //         System.out.print(j + " ");
        //     }

        //     System.out.println();
        //     count = count * 2 + 1;
        //     row++;
        //     space--;
        // }
    }

    public static void pattern4(int n) {
        int star = n;
        int space = 0;
        int row = 1;

        while(row <= n) {
            //space
            int j = 1;
            while(j <= space) {
                System.out.print("  ");
                j++;
            }

            //star
            int i = 1;
            while(i <= star) {
                System.out.print("* ");
                i++;
            }

            System.out.println();
            star--;
            space += 2;
            row++;
        }
    }

    public static void main(String[] args) {
        findGCD(60, 36);
    }
}
