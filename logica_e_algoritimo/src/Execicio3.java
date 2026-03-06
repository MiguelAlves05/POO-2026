import java.util.Scanner;

public class Execicio3 {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 10};

        int contador = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                contador++;
            }
        }
        System.out.println("Quantidades de pares: " + contador);
    }
}
