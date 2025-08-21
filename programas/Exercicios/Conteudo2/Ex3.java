import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, dif;

        System.out.println("Digite um numero: ");
        a = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite um numero: ");
        b = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite um numero: ");
        c = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite um numero: ");
        d = sc.nextInt();
        sc.nextLine();

        dif = a * b - c * d;

        System.out.printf("DIFERENÇA = %d", dif);

        sc.close();
    }
}
