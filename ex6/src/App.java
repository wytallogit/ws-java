import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double trianguloRetangulo = A * C / 2;
        double ciruculo = Math.PI * Math.pow(C, 2);
        double trapezio = ((A * B) * C) / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        System.out.println(trianguloRetangulo);
        System.out.println(ciruculo);
        System.out.println(trapezio);
        System.out.println(quadrado);
        System.out.println(retangulo);

        sc.close();
    }
}
