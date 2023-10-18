import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome #" + (i + 1) + ": ");
            nomes[i] = input.next();
        }

        System.out.print("Digite um nome para verificar se está na lista: ");
        String nomeVerificar = input.next();

        boolean encontrado = false;

        for (String nome : nomes) {
            if (nomeVerificar.equals(nome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(nomeVerificar + " está na lista.");
        } else {
            System.out.println(nomeVerificar + " não está na lista.");
        }
    }
}
