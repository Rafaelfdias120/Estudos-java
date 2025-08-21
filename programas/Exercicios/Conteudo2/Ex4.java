import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double sal, hr, vhr;

        System.out.println("Digite o numero do funcionario: ");
        n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite as horas trabalhadas");
        hr = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Digite quanto vale cada hora");
        vhr = sc.nextDouble();
        sc.nextLine();

        sal = vhr * hr;

        System.out.printf("NUMBER = %d%n", n);

        System.out.printf("SALARY = %.2f", sal);
        
        sc.close();
    }
}