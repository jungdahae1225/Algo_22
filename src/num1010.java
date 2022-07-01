import java.util.Scanner;

class num1010 {

    public static double Combination(double n, double r){
        double a = 1, b = 1;

        for(double i = n; i > (n-r); i--){
            a *= i;
        }

        for(double i = 2; i <= r; i++){
            b *= i;
        }

        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        double[] a = new double[testNum];

        for(int i = 0; i < testNum; i++){
            double n = sc.nextDouble();
            double m = sc.nextDouble();
            a[i] = Combination(m, n);
        }

        for(int i = 0; i < testNum; i++) {
            System.out.printf("%.0f", a[i]);
            System.out.println();
        }
        sc.close();
    }
}