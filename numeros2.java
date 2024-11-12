package condicionais;
import java.util.Scanner;

public class numeros2 {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        n1 = entrada.nextInt();

        System.out.println("Informe o segundo numero: ");
        n2 = entrada.nextInt();

        System.out.println("Informe o terceiro numero: ");
        n3 = entrada.nextInt();

        int menor = n1;

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        System.out.println("O menor numero é: " + menor);
    }
}
