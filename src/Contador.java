import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int parametro1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int parametro2 = scanner.nextInt();

        scanner.close();

        try {
            imprimirNumeros(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void imprimirNumeros(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio > fim) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        for (int i = inicio; i <= fim; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}