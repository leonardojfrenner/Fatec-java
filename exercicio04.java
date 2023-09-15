package exercicio04;

import java.util.Random;

public class exercicio04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < 15; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("Maior valor: " + maximo);
        System.out.println("Menor valor: " + minimo);
    }
}

