import java.util.Locale; //Importa a função de troca de localidade
import java.util.Scanner; //Importa a função de troca de ler dados de entrada

public class Est9 {
    public static void main(String[] ags){

        Locale.setDefault(Locale.US); //Troca a localidade do programa e troca o , pelo . no nuemeros flutuantes
        Scanner sc = new Scanner(System.in); // Cria uma variavel(sc) que recebe dados de entrada

        String x; // Armazena mais de uma palavra
        int y; // Armazena numeros inteiros 
        double z; // Armazena numeros flutuantes
        char c; // Armazena uma letra

        x = sc.next(); // Faz que com que a variavel receba dados de entrada do tipo: String
        y = sc.nextInt(); // Faz que com que a variavel receba dados de entrada do tipo: int
        z = sc.nextDouble(); // Faz que com que a variavel receba dados de entrada do tipo: double
        c = sc.next().charAt(0); // Faz que com que a variavel receba dados de entrada do tipo: double

        System.out.println("Dados digitados: ");
        System.out.println("Você digitou: " + x );
        System.out.println("Você digitou: " + y );
        System.out.println("Você digitou: " + z );
        System.out.println("Você digitou: " + c );
        
        sc.close(); // Faz com que o programa pare de ler dados de entrada
    }
} 