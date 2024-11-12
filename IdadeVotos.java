package condicionais;

import java.util.Scanner;

public class IdadeVotos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();


        if (idade >= 16 && idade <= 17) {
            System.out.println("Voto opcional!");
        }
        else if (idade >= 18 && idade <= 69) {
            System.out.println("Voto obrigatorio!");
        }
        else if (idade >= 70) {
            System.out.println("Voto opcional!");
        }
    }
}
