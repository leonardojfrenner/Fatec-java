package exercicio06;
import java.util.Random;

	public class exercicio06 {
	    public static void main(String[] args) {
	        Random random = new Random();
	        int[] numeros = new int[10];

	        for (int i = 0; i < 10; i++) {
	            numeros[i] = random.nextInt(100) + 1;
	        }

	        System.out.println("Array original:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(numeros[i] + " ");
	        }

	        System.out.println("\nArray em ordem reversa:");
	        for (int i = 9; i >= 0; i--) {
	            System.out.print(numeros[i] + " ");
	        }
	    }
	}





