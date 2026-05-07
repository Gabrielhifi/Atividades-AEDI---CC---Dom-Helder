import java.util.Scanner;
//Gabriel vieira reis
public class C08EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        // 1º LAÇO (EXTERNO): Controla quantas vezes o desenho inteiro será feito
        for (int repeticao = 1; repeticao <= 10; repeticao++) {
            // 2º LAÇO: Parte Crescente do Triângulo
            for (int linha = 1; linha <= 5; linha++) {
                // Desenha os asteriscos da linha atual
                for (int coluna = 1; coluna <= linha; coluna++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println(); // Pula para a próxima linha
            }
            // 3º LAÇO: Parte Decrescente do Triângulo
            for (int linha3 = 5; linha3>= 1; linha3--) {
                // Desenha os asteriscos da linha atual
                for (int coluna2 = 1; coluna2 <= linha3; coluna2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println(); // Pula para a próxima linha
            }
        }
        teclado.close();
    }
}