import java.util.Locale;

public class App {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n %s, wich price is $ %.2f\n %s, which price is $ %.2f\n", product1, price1, product2, price2);

        System.out.printf("Record: %d yeares old, code %d and gender: %s\n", age, code, gender);

        Locale.setDefault(Locale.US);
        System.out.printf("Measue with eight decimal places: %f \n Rouded (three decimal places): %f \n US decimal point : %f", measure, measure, measure);

    }
}
