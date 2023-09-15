package exercicio09;
import java.util.Random;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numeros = new int[25];
        
        for (int i = 0; i < 25; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.print("Digite um número para buscar no array: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 25; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroBuscado + " foi encontrado no array.");
        } else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado no array.");
        }

        scanner.close();
    }
}
