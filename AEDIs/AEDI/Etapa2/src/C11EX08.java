//Gabriel Vieira Reis
import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis de entrada
        String nome, funcao, nomeMaior = "", funcaoMaior = "";
        double valorHora, horasTrab, premio, salarioFinal;

        // Variáveis para estatísticas
        double totalFolha = 0, somaHoras = 0, maiorSalario = -1;
        int contPessoas = 0;
        int faixaA = 0, faixaB = 0, faixaC = 0; // Contadores de prêmios

        System.out.print("Informe o valor da hora trabalhada no projeto: ");
        valorHora = input.nextDouble();
        input.nextLine(); // Limpar o buffer

        while (true) {
            System.out.print("\nNome do trabalhador (ou 'fim' para sair): ");
            nome = input.nextLine();

            // Condição de parada (flag) no nome
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Função: ");
            funcao = input.nextLine();
            System.out.print("Quantidade de horas trabalhadas: ");
            horasTrab = input.nextDouble();
            input.nextLine(); // Limpar buffer

            // Cálculo do Prêmio por Produtividade
            if (horasTrab <= 100) {
                premio = 1000.00;
                faixaA++;
            } else if (horasTrab <= 500) {
                premio = horasTrab * 10.00;
                faixaB++;
            } else {
                premio = (Math.floor(horasTrab / 10)) * 100.00;
                faixaC++;
            }

            salarioFinal = (horasTrab * valorHora) + premio;

            // Alínea (a): Valor que cada um tem a receber
            System.out.printf("O trabalhador %s receberá: R$ %.2f%n", nome, salarioFinal);

            // Acumuladores para estatísticas
            totalFolha += salarioFinal;
            somaHoras += horasTrab;
            contPessoas++;

            // Alínea (c): Verificar quem recebe o maior salário
            if (salarioFinal > maiorSalario) {
                maiorSalario = salarioFinal;
                nomeMaior = nome;
                funcaoMaior = funcao;
            }
        }

        // Impressão dos resultados finais (após o loop)
        if (contPessoas > 0) {
            System.out.println("\n--- RELATÓRIO FINAL DO PROJETO ---");

            // b) Média de horas
            System.out.printf("Média de horas trabalhadas: %.2f horas%n", (somaHoras / contPessoas));

            // c) Nome e função do maior salário
            System.out.println("Maior salário: " + nomeMaior + " (" + funcaoMaior + ")");

            // d) Quantidade por faixa de prêmio
            System.out.println("Pessoas na faixa de prêmio Fixo (Até 100h): " + faixaA);
            System.out.println("Pessoas na faixa de prêmio por Hora (101-500h): " + faixaB);
            System.out.println("Pessoas na faixa de prêmio por Lote (Acima 500h): " + faixaC);

            // e) Total da folha
            System.out.printf("Valor total da folha de pagamento: R$ %.2f%n", totalFolha);
        } else {
            System.out.println("Nenhum trabalhador foi registrado.");
        }
    }
}