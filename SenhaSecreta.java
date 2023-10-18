import java.util.Scanner;

public class SenhaSecreta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senhaCorreta = "python123";
        boolean senhaCorretaInserida = false;

        while (!senhaCorretaInserida) {
            System.out.print("Digite a senha: ");
            String senhaInserida = input.next();

            if (senhaInserida.equals(senhaCorreta)) {
                senhaCorretaInserida = true;
                System.out.println("Senha correta! Acesso concedido.");
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
    }
}
