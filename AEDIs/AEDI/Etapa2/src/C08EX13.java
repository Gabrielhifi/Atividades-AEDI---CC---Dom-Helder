import java.util.Scanner;
//Gabriel Vieira Reis
public class C08EX13 {
    public static void main(String[] args) {
        String cidade, menorcidade = " ";
        long populacao, eleitores, homens = 0, mulheres = 0, soma, cidaddeGrande = 0, contmulher = 0;

        // Inicia com o maior valor possível para garantir que a 1ª cidade substitua esse valor
        long menosspop = Long.MAX_VALUE;
        double percent = 0;

        Scanner arquivo = new Scanner(
                C08EX13.class.getResourceAsStream("c08ex13TX.txt")
        );

        while (arquivo.hasNextLine()){
            cidade = arquivo.nextLine();

            // Se a linha estiver vazia (só um "enter" solto), pula para a próxima leitura
            if (cidade.trim().isEmpty()) {
                continue;
            }

            populacao = arquivo.nextLong();
            eleitores = arquivo.nextLong();
            homens = arquivo.nextLong();
            mulheres = arquivo.nextLong();

            // Consome o "enter" que sobra após o último número
            if (arquivo.hasNextLine()) {
                arquivo.nextLine();
            }

            soma = homens + mulheres;
            if (soma != populacao){
                System.out.println("A soma de homens e mulheres difere da população na cidade de " + cidade + " (ERRO)");
            }

            // Cast (double) para manter as casas decimais
            percent = ((double) eleitores * 100) / populacao;
            System.out.println("O percentual de eleitores na cidade de " + cidade + " é: " + percent + "%");

            if (populacao > 1000000){
                cidaddeGrande++;
            }
            if (mulheres > homens){
                contmulher++;
            }
            if (populacao < menosspop){
                menosspop = populacao;
                menorcidade = cidade;
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Cidades com mais de 1 milhão de pessoas: " + cidaddeGrande);
        System.out.println("Cidades onde as mulheres são maioria: " + contmulher);
        System.out.println("A menor cidade é: " + menorcidade);

        arquivo.close();
    }
}