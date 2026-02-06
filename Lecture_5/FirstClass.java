public class FirstClass {
    public static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=n-1-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        int space = 0;
        int star = 2*n-1;
        int row = 1;

        while (row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space++;
            star-=2;
            row++;
        }

    }

    public static void pattern3(int n) {
        int row = 1;
        int space = n-1;
        int star = 1;
        while (row <= n){
            int i = 1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star){
                if(j%2==1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            space--;
            star+=2;
            row++;

        }
    }

    public static void pattern4(int n) {
        int row = 1;
        int space = n-1;
        int star = 1;
        while (row <= n){
            int i = 1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star){
                if(j%2==1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("! ");
                }
                j++;
            }
            System.out.println();
            space--;
            star+=2;
            row++;

        }
    }

    public static void pattern5(int n) {
        int row = 1;
        int space = 2*n-3;
        int star = 1;
        
        while(row <= n) {
            // star
            int i=1;
            while(i <= star) {
                System.out.print("* ");
                i++;
            }

            //space
            int j = 1;
            while(j <= space) {
                System.out.print("  ");
                j++;
            }

            // star
            if(row == n) {
                star--;
            }
            int k = 1;
            while(k <= star) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
            row++;
            space -= 2;
            star++;
        }
    }
    public static void main(String[] args) {
        pattern5(5);
    }
}
