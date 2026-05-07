//Gabriel Vieira  Reis
import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double txBDI, quntd, prcUnit, custTT = 0, custparc, bdi;
        String nome;

        System.out.println("Digite a taxa de BDI: ");
        txBDI = teclado.nextDouble();

        teclado.nextLine();

        do {
            System.out.println("Qual o nome do material (ou 'Fim' para sair): ");
            nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("Fim")) {
                break;
            }

            System.out.println("Qual a quantidade do produto: ");
            quntd = teclado.nextDouble();

            System.out.println("Qual o preço do produto: ");
            prcUnit = teclado.nextDouble();

            teclado.nextLine();

            custparc = quntd * prcUnit;
            custTT += custparc;
            System.out.println("Custo parcial do produto: R$" + custparc);

        } while (true);

        bdi = (txBDI / 100) * custTT;
        custTT = bdi + custTT;
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.printf("Preço total com BDI: R$%.2f%n", custTT);

        teclado.close();
    }
}