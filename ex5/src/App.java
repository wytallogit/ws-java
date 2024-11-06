import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int np1 = sc.nextInt();
        double vp1 = sc.nextDouble();

        int p2 = sc.nextInt();
        int np2 = sc.nextInt();
        double vp2 = sc.nextDouble();

        double valor = (np1 * vp1) + (np2 * vp2);

        System.out.printf("Valor a pagar: R$ %.2f", valor);

        sc.close();
    }
}
