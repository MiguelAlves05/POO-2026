import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double numero;
         double maior = Integer.MIN_VALUE;

         for(double i=1; i<=5; i++){
             System.out.print("Digite um numero: ");
             numero = input.nextDouble();

             if (numero > maior){
                 maior = numero;
             }
         }
         System.out.println("O maior número é: " + maior);
    }
}