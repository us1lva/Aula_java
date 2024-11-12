package condicionais;

import java.util.Scanner;

public class PesoImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        float peso = entrada.nextFloat();
        System.out.print("Digite o seu altura: ");
        float altura = entrada.nextFloat();

        float imc = (peso / (altura * altura));

        if(imc <= 16.9){
            System.out.println("Voce está muito abaixo do peso");
        }else if(imc >= 17 && imc <= 18.4){
            System.out.println("Voce está abaixo do peso");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso");
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade1");
        }else if(imc >= 35 && imc <= 40){
            System.out.println("Obesidade2");
        }else if(imc >= 40){
            System.out.println("Obesidade3");
        }
    }
}
