package exercicio08;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int[] frequencia = new int[10];
        for (int i = 0; i < 10; i++) {
            int numero = numeros[i];
            frequencia[numero - 1]++; 
        }

       
        int valorMaisFrequente = 0;
        int frequenciaMaisFrequente = 0;

        for (int i = 0; i < 10; i++) {
            if (frequencia[i] > frequenciaMaisFrequente) {
                frequenciaMaisFrequente = frequencia[i];
                valorMaisFrequente = i + 1;
            }
        }
        System.out.println("O valor mais frequente é " + valorMaisFrequente + " com uma frequência de " + frequenciaMaisFrequente + " vezes.");

        scanner.close();
    }
}
