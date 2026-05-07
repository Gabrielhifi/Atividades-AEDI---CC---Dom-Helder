//Gabriel Vieira Reis
import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
        // Usando o Scanner para ler o arquivo conforme sua estrutura
        Scanner teclado = new Scanner(C10EX08.class.getResourceAsStream("c10ex08.txt"));

        String nomeCidade, menorPOP = "";
        long populacao, eleitoresCidade, mulher, homem;

        // Acumuladores e contadores
        long totalEleitores = 0, popEstado = 0, somaHomens = 0;
        int contCidade = 0, contMaisMulher = 0;
        long menorPopuValor = Long.MAX_VALUE; // Começa com o maior valor possível

        while (teclado.hasNextLine()) {
            nomeCidade = teclado.nextLine();

            // Verifica a flag antes de processar os números
            if (nomeCidade.equalsIgnoreCase("Zimbabue de Minas")) {
                break;
            }

            populacao = teclado.nextLong();
            eleitoresCidade = teclado.nextLong();
            mulher = teclado.nextLong();
            homem = teclado.nextLong();
            teclado.nextLine(); // Limpa o buffer após os números

            // a) Validação da soma
            if (mulher + homem != populacao) {
                System.out.println("Aviso: População de " + nomeCidade + " difere da soma MH");
            }

            // b) e c) Acumuladores
            contCidade++;
            popEstado += populacao;
            totalEleitores += eleitoresCidade;
            somaHomens += homem;

            // e) Cidades com mais mulheres
            if (mulher > homem) {
                contMaisMulher++;
            }

            // g) Cidade de menor população
            if (populacao < menorPopuValor) {
                menorPopuValor = populacao;
                menorPOP = nomeCidade;
            }
        }

        // Impressão dos resultados conforme os itens do exercício
        System.out.println("\n--- RESULTADOS IBGE ---");
        System.out.println("b) Total de cidades: " + contCidade);
        System.out.println("c) População total do estado: " + popEstado);

        // d) Percentual de eleitores (usando double para precisão)
        double percentual = (totalEleitores * 100.0) / popEstado;
        System.out.printf("d) Percentual de eleitores: %.2f%%%n", percentual);

        System.out.println("e) Cidades com mais mulheres: " + contMaisMulher);

        // f) Média de homens
        if (contCidade > 0) {
            double mediaH = (double) somaHomens / contCidade;
            System.out.printf("f) Média de homens por cidade: %.2f%n", mediaH);
        }

        System.out.println("g) Cidade de menor população: " + menorPOP);

        teclado.close();
    }
}