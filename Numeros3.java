package condicionais;
import java.util.Scanner;

public class Numeros3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("Esse numero é par!!! ");
        }else{
            System.out.println("Esse numero é impar!!! ");
        }
    }
}
