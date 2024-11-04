import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault((Locale.US));
        Scanner n1 = new Scanner(System.in);
        String x;
        int y;
        double z;
        x = n1.next();
        y = n1.nextInt();
        z = n1.nextDouble();


        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        n1.close();
    }
}
