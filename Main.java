public class Main {

    public static void main(String[] args) {
        int n = 0;
        System.out.print("Perfect squares: ");
        while (n < 10) {
            n++;
            int square = n * n;
            System.out.printf("%d ", square);
           }
        System.out.println();

        n = 0;
        System.out.print("Perfect cubes: ");
        while (n < 10) {
            n++;
            int cube = n * n * n;
            System.out.printf("%d ", cube);
        }
        System.out.println();

        n = 1;
        System.out.print("Fibonacci: ");
        int[]fibonacci = new int[10];
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        for(int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for(int i = 0; i < fibonacci.length; i++) {
            System.out.printf("%d ", fibonacci[i]);
        }
        System.out.println();

        System.out.print("Prime numbers: ");
        for (int num = 2; num < 30; num++) {
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.printf("%d ", num);
        }
        System.out.println();

        System.out.print("Triangle Numbers: ");
        int[]triangles = new int[10];
        triangles[0] = 1;
        for(int i = 1; i < triangles.length; i++) {
            triangles[i] = triangles[i - 1] + i + 1;
        }
        for(int i = 0; i < triangles.length; i++) {
            System.out.printf("%d ", triangles[i]);
        }

    }
}