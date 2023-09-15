package exercicio02;
import java.util.Random;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Random random = new Random();       
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int palpite;
                
        while (true) {
            System.out.print("Adivinhe o número (entre 1 e 100): ");
            palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
                break; 
            }
        }        
        scanner.close();
    }
}