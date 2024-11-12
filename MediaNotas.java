package condicionais;

import java.util.Scanner;


public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o primeiro nota: ");
        float numero = entrada.nextFloat();

        System.out.println("Entre com o segundo nota: ");
        float numero2 = entrada.nextFloat();

        System.out.println("Entre com a terceira nota: ");
        float numero3 = entrada.nextFloat();

        System.out.println("Entre com a quarta nota: ");
        float numero4 = entrada.nextFloat();


        float media = ((numero + numero2 + numero3 + numero4) / 4);

        System.out.println("O valor do primeiro numero é: " + numero);
        System.out.println("o valor do segundo numero é: " + numero2);
        System.out.println("O terceiro numero é: " + numero3);
        System.out.println("O quarto numero é: " + numero4);
        System.out.println("O valor da media dos numeros " + numero + " + " + numero2 + " + " + numero3 + " + " + numero4 + " = " + media);

        if (media >= 7){
            System.out.println("Parabens, aprovado!!!");
        } else if (media >= 5) {
            System.out.println("Está de recuperação!!!");
        } else if (media <= 5) {
            System.out.println("Reprovado!!!");
        }
    }
}
