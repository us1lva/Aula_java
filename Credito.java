package condicionais;
import java.util.Scanner;

public class Credito {
    public static void main(String[] args) {

        int Saldo;
        float porcentagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o saldo do credito: ");
        Saldo = entrada.nextInt();

        if(Saldo >= 0 && Saldo <= 500){
            System.out.println("Não tem adição de creditos");
        }else if(Saldo >= 501 && Saldo <= 1000){
            porcentagem = (float) (Saldo * 0.3);
            System.out.println("O seu saldo de " + Saldo + " teve um aumento de 30% "  + "Resultando em " + porcentagem + " Do percentual");
        }else if(Saldo >= 1001 && Saldo <= 3000){
            porcentagem = (float) (Saldo * 0.4);
            System.out.println("O seu saldo de " + Saldo + " teve um aumento de 40% "  + "Resultando em " + porcentagem + " Do percentual");
        }else if(Saldo >= 3000){
            porcentagem = (float) (Saldo * 0.5);
            System.out.println("O seu saldo de " + Saldo + " teve um aumento de 50% "  + "Resultando em " + porcentagem + " Do percentual");
        }
    }
}
