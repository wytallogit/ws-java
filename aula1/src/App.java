import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double  x;
        x = sc.nextDouble();
        System.out.println("Você digitou " + x);

        sc.close();
    }
}
