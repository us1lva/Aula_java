package condicionais;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        int numero,numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        numero2 = entrada.nextInt();

        System.out.println("Exibindo o maior");
        if(numero>numero2){
            System.out.println(numero + " É maior");
        } else if (numero<numero2){
            System.out.println(numero2 + " É maior");
        }
    }
}
