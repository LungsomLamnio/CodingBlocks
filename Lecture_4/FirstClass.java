public class FirstClass {
    public static void pattern1(int row, int col) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int row, int col) {
        int rowCount = 1;

        while(rowCount <= row) {
            int i = 1;
            while(i <= col) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rowCount++;
        }
    }

    public static void pattern3(int row) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int row) {
        int i = 1;

        while(i <= row) {
            int j = 1;

            while(j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern5(int row) {
        for(int i=row; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int row) {
        int i = row;

        while(i >= 0) {
            int j = 0;

            while(j <= i) {
                System.out.print("* ");
                j++;
            }
            i--;
            System.out.println();
        }
    }

    public static void pattern7(int row) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<row-1-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern8(int n) {
        int space = n-1;
        int star = 1;
        int row = 1;

        while(row <= n) {
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }

            space--;
            star++;
            row++;
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern9(int n) {
        int space = 0;
        int star = n;
        int row = 1;

        while(row <= n) {
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }

            space++;
            star--;
            row++;
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern10(int n) {
        int space = 0;
        int star = n;
        int row = 1;

        while(row <= n) {
            int i = 1;
            while(i <= 2 * space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }

            space++;
            star--;
            row++;
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern11(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern11(5);
    }
}
