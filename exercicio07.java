package exercicio07;
import java.util.Random;
public class exercicio07 {
	    public static void main(String[] args) {
	        Random random = new Random();
	        int[] numeros = new int[50];

	        for (int i = 0; i < 50; i++) {
	            numeros[i] = random.nextInt(10) + 1;
	        }
	        int[] frequencia = new int[10];
	        
	        for (int i = 0; i < 50; i++) {
	            int numero = numeros[i];
	            frequencia[numero - 1]++; 
	        }

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Número " + (i + 1) + ": " + frequencia[i] + " vezes");
	        }
	    }
	}
