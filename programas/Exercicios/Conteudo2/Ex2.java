import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, pi, area;

        pi = 3.14159;

        System.out.println("Digite um numero: ");
        raio = sc.nextDouble();

        area = pi * raio * 2;

        System.out.printf("A = %.4f", area);

        sc.close();
    }
}
