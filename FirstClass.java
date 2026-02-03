public class FirstClass {
    public static int add(int num1, int num2) {
        return num1+num2;
    }

    public static int simpleInterest(int p, int r, int t) {
        return (p*r*t)/100;
    }

    public static void checkEvenOdd(int num) {
        if(num%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int maxOfTwoNum(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void checkGrade(int marks) {
        if(marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        }

        if(marks > 90) {
            System.out.println("A");
        } else if(marks > 70) {
            System.out.println("B");
        } else if(marks > 50) {
            System.out.println("C");
        } else if(marks > 30) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void printTillN(int n) {
        for(int i=1; i<=n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void multiplicationTable(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }

    public static int findFactorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return n * findFactorial(n-1);
    }

    public static void printAllEven(int n) {
        for(int i=2; i<=n; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAllOdd(int n) {
        for(int i=1; i<=n; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int sumOfN(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void reverseNumber(int n) {
        int reverse = 0;
        int temp = n;
        
        while(temp > 0) {
            int lastDigit = temp%10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
        }

        System.out.println(reverse);
    }

    public static int sumOfAllDigits(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    public static double volOfCone(double r, double h) {
        return (3.14 * r * r * h) *1/3;
    }

    public static double volOfCylinder(double r, double h) {
        return 3.14 * r * r * h;
    }

    public static double volOfHemisphere(double r, double h) {
        return (3.14 * r * r * r)* 2/3;
    }
    public static void main(String[] args) {
        System.out.println(volOfCone(2, 3));
        System.out.println(volOfCylinder(2, 3));
        System.out.println(volOfHemisphere(2, 3));
    }
}