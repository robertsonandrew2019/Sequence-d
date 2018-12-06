ppublic class Main {

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

        //fibonacci sequences
        System.out.print("Fibonacci: ");
        int[]fibonacci = new int[10];
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        n = 2;
        while (n < fibonacci.length) {
            fibonacci[n] = fibonacci[n - 1] + fibonacci[n - 2];
            n++;
        }
        n = 0;
        while (n < fibonacci.length) {
            System.out.printf("%d ", fibonacci[n]);
            n++;
        }
        System.out.println();
        
        //prime numbers
        System.out.print("Prime numbers: ");
        int num = 2;
        while (num < 30) {
            boolean flag = false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.printf("%d ", num);
            }
            num++;
        }
        System.out.println();

        System.out.print("Triangle Numbers: ");
        int[]triangles = new int[10];
        triangles[0] = 1;
        n = 1;
        while (n < triangles.length) {
            triangles[n] = triangles[n - 1] + (n + 1);
            n++;
        }
        n = 0;
        while (n < triangles.length) {
            System.out.printf("%d ", triangles[n]);
            n++;
        }

    }
}
