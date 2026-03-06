import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero;
        double soma = 0.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um numero " + i + ": ");
            numero = sc.nextDouble();
            soma = soma + numero;
        }
        double media = soma/10.0;
        System.out.println("A média dos números é: " + media);
    }
}
