public class Est11 {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); // A esta recebendo a raiz quadrada de x
        B = Math.sqrt(y); // B esta recebendo a raiz quadrada de y
        C = Math.sqrt(25.0); // C esta recebendo a raiz quadrada de 25.0 

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y); // A esta recebendo a potenciação de x e y
        B = Math.pow(x, 2.0); // B esta recebendo a potenciação de 2.0
        C = Math.pow(5.0, 2.0); // C esta recebendo a potenciação de 5.0 e 2.0

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y); // A esta recebendo o valor absoluto de y
        B = Math.abs(z); // A esta recebendo o valor absoluto de z

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

    }
}