public class FirstClass {
    public static void pattern1(int n) {
        int row = n;
        int star = 1;
        
        while(row <= n) {
            int i = 1;

            while(i <= star) {
                System.out.print("* ");
            }
            System.out.println();
            star++;
            row++;
        }
    }
    public static void main(String[] args) {
        
    }
}