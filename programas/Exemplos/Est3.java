import java.util.Locale;

public class Est3 {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.36238;
        Locale.setDefault(Locale.US);
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros %n", x);
    }
}