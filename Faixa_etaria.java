import java.util.Scanner;

public class Faixa_etaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
