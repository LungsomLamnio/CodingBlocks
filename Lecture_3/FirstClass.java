public class FirstClass {
    public static boolean inStraightLine(int x1, int x2, int x3, int y1, int y2, int y3) {
        float m1 = (y2 - y1) / (x2 - x1);
        float m2 = (y3 - y2) / (x3 - x2);

        return m1 == m2;
    }

    public static void loteryGame(int n) {
        if(n >= 300 && n <= 460) {
            System.out.println("You won a Macbook");
        } else if(n >= 200 && n <= 280) {
            System.out.println("You won a Kurkure");
        } else if(n >= 1100 && n <= 1500) {
            System.out.println("You won a Cycle");
        } else if(n > 50 && n <= 80) {
            System.out.println("You won a Bike");
        } else {
            System.out.println("Better Luck Next Time");
        }
    }

    public static void loteryGameII(int n) {
        if(n >= 300 && n <= 460) {
            System.out.println("You won a Macbook");
            if(n >= 300 && n <= 380) {
                System.out.println("Model: M1 MAC");
            } else if(n >= 381 && n <= 460) {
                System.out.println("Model: M2 MAC");
            }
        } else if(n >= 200 && n <= 280) {
            System.out.println("You won a Kurkure");
            if(n >= 200 && n <= 240) {
                System.out.println("Flavor: Chilli Kurkure");
            } else if(n >= 241 && n <= 280) {
                System.out.println("Flavor: Onion Kurkure");
            }
        } else if(n >= 1100 && n <= 1500) {
            System.out.println("You won a Cycle");
            if(n >= 1100 && n <= 1300) {
                System.out.println("Brand: Avon Cycle");
            } else if(n >= 1301 && n <= 1500) {
                System.out.println("Brand: Hero Cycle");
            }
        } else if(n > 50 && n <= 80) {
            System.out.println("You won a Bike");
            if(n > 50 && n <= 65) {
                System.out.println("Model: Bullet");
            } else if(n > 65 && n <= 80) {
                System.out.println("Model: Rajdoot");
            }
        } else {
            System.out.println("Better Luck Next Time");
        }
    }

    public static void APSeries(int a, int d) {
        for(int i=1; i<=15; i++) {
            System.out.print(a + (i - 1) * d + " ");
        }
    }

    public static void GPSeries(int a, int r) {
        for(int i=1; i<=10; i++) {
            System.out.print(a * Math.pow(r, i-1) + " ");
        }
    }
    public static void main(String[] args) {
       GPSeries(2, 3);
    }
}