public class App {
    public static void main(String[] args) throws Exception {
        double x = 9.0;
        double y = 2.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.pow(x, y);
        C = Math.abs(z);

        System.out.println("Raiz quadrada de "+ x + " e " + A);
        System.out.println(x + " elevado a " + y + " e " + B);
        System.out.println("O numero absoluto de "+ z + " e " + C);
    }
}
