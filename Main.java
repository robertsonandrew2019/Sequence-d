public class Main {

    public static void main(String[] args) {
       //perfect squares
        int n = 0;
        System.out.print("Perfect squares: ");
        while (n < 10) {
            n++;
            int square = n * n;
            System.out.printf("%d ", square);
           }
        System.out.println();

        //perfect cubes
        n = 0;
        System.out.print("Perfect cubes: ");
        while (n < 10) {
            n++;
            int cube = n * n * n;
            System.out.printf("%d ", cube);
        }
        System.out.println();

        //fibonacci sequence
        System.out.print("Fibonacci: ");
        int f1 = 0;
        int f2 = 1;
        int f3;
        n = 1;
        while (n <= 10) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n++;
            System.out.printf("%d ", f3);
        }
        System.out.println();

        //prime numbers - needs revision
        System.out.print("Prime numbers: ");
        int num = 2;
        while (num < 30) {
            boolean flag = false;
            n = 2;
            while (n <= (num / 2)) {
                if (num % n == 0) {
                    flag = true;
                    break;
                }
                n++;
            }
            if (!flag) {
                System.out.printf("%d ", num);
            }
            num++;
        }
        System.out.println();

        //triangle numbers
        System.out.print("Triangle Numbers: ");
        n = 1;
        while (n <= 10) {
            int tri = (n * (n + 1) / 2);
            System.out.printf("%d ", tri);
            n++;
        }
    }
}
