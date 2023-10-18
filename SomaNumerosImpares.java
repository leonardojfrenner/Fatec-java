
import java.util.Scanner;

public class SomaNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro n: ");
        int n = input.nextInt();

        int soma = 0;
        int numeroImpar = 1;

        for (int i = 0; i < n; i++) {
            soma += numeroImpar;
            numeroImpar += 2;
        }

        System.out.println("A soma dos primeiros " + n + " números ímpares é: " + soma);
    }
}
