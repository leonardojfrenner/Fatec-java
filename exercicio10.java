package exercicio10;
import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int contadorSomaSete = 0;
        for (int i = 0; i < 100; i++) {
            int dado1 = random.nextInt(6) + 1; 
            int dado2 = random.nextInt(6) + 1; 
            int soma = dado1 + dado2;

            if (soma == 7) {
                contadorSomaSete++;
            }
        }
        System.out.println("A soma dos dois dados resultou em 7 em " + contadorSomaSete + " de 100 simulações.");
    }
}

