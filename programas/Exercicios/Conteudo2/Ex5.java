import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

        System.out.println("Digite o primeiro código do produto: ");
	    cod1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite a primeira quantidade do produto: ");
	    qte1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o primeiro preço do produto: ");
	    preco1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o Segundo código do produto: ");
	    cod2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite a segunda quantidade do produto: ");
	    qte2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o segundo preço do produto: ");
	    preco2 = sc.nextDouble();
        sc.nextLine();

	    total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("Código do primeiro produto: %d%n", cod1);

        System.out.printf("Código do primeiro produto: %d%n", cod2);

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
    }
}