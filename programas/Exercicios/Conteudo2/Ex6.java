import java.util.Scanner;
import java.util.Locale;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, tri, cir, tra, qua, ret;

        System.out.println("Digite o valor de A:");
        a = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o valor de B:");
        b = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o valor de C:");
        c = sc.nextDouble();
        sc.nextLine();

        
        tri  = a * c / 2;
        cir = 3.14159 * Math.pow(c, 2.00);
        tra = (a + b) * c / 2;
        qua = a * Math.pow(b, 2.00);
        ret = a * b;
        
        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", cir);
        System.out.printf("TRAPEZIO: %.3f%n", tra);
        System.out.printf("QUADRADO: %.3f%n", qua);
        System.out.printf("RETANGULO: %.3f%n", ret);

        sc.close();
    }
}