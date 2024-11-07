import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int i = 0;
        while (x != 0) {
            i += x;
            x = sc.nextInt();
        }

        System.out.println("O programa terminou.");
        System.out.println(i);

        sc.close();
    }
}
