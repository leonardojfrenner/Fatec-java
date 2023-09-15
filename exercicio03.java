package exercicio03;
import java.util.Random;

public class exercicio03 {
    public static void main(String[] args) {
       
        Random random = new Random();
        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        int soma = 0;
        for (int i = 0; i < 20; i++) {
            soma += numeros[i];
        }
        double media = (double) soma / 20;
        System.out.println("Array de números:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nMédia dos números: " + media);
    }
}
