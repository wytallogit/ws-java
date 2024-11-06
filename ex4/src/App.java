import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int hoursWork = sc.nextInt();
        double hoursMoney = sc.nextDouble();

        double salario = hoursMoney * hoursWork;

        System.out.println("Numero: " + num);
        System.out.printf("U$: %.2f ", salario);

        sc.close();
    }
}
