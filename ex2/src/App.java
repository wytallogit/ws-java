import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.printf("%.2f", area);

        sc.close();
    }
}
