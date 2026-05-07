import java.util.Scanner;
//Gabriel vieira reis
public class C08EX25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Vamos definir um tamanho fixo para o triângulo (ex: 5 linhas de altura máxima)
        int tamanhoMaximo = 5;

        // 1º LAÇO (EXTERNO): Controla quantas vezes o desenho inteiro será feito
        for (int repeticao = 1; repeticao <= 10; repeticao++) {


            // 2º LAÇO: Parte Crescente do Triângulo
            for (int linha = 1; linha <= tamanhoMaximo; linha++) {
                // Desenha os asteriscos da linha atual
                for (int coluna = 1; coluna <= linha; coluna++) {
                    System.out.print("*");
                }
                System.out.println(); // Pula para a próxima linha
            }

            // 3º LAÇO: Parte Decrescente do Triângulo
            for (int linha = tamanhoMaximo - 1; linha >= 1; linha--) {
                // Desenha os asteriscos da linha atual
                for (int coluna = 1; coluna <= linha; coluna++) {
                    System.out.print("*");
                }
                System.out.println(); // Pula para a próxima linha
            }

            System.out.println(); // Pula uma linha extra antes de começar o próximo desenho
        }

        teclado.close();
    }
}