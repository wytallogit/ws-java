import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        while(senha != 0000) {
            System.out.println("Senha inválida");
            if (senha == 0000) {
                System.out.println("Acesso liberado!");
                senha = 0000;
            }
            sc.nextInt();
            break;
        }

        sc.close();
    }
}
