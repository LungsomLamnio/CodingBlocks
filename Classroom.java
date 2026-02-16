class Classroom {
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
    public static void main(String[] args) {
        add(2, 3);
        System.out.println(add2(4, 3));
        oddEven(4);
        System.out.println(oddEven2(7));
        maxNum(56, 76);
        System.out.println(maxNum2(34, 43));
    }
}
