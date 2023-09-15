package exercicio05;
import java.util.Random;

public class exercicio05 {
	public class Exercicio05 {
	    public static void main(String[] args) {
	        Random random = new Random();
	        int[] numeros = new int[30];
	        int contadorImpares = 0;

	        for (int i = 0; i < 30; i++) {
	            numeros[i] = random.nextInt(100) + 1;
	            if (numeros[i] % 2 != 0) {
	                contadorImpares++;
	            }
	        }

	        System.out.println("Quantidade de números ímpares: " + contadorImpares);
	    }
	}
}
	

	