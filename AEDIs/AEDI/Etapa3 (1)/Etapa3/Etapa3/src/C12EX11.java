//Gabriel Vieira Reis
import java.util.Scanner;
public class C12EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[8];
        int nota[] = new int[8];
        int maiorNota = 0;
        String maiorNot = "";
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.println("Digite a nota do aluno: ");
            nota[i] = teclado.nextInt();
            teclado.nextLine();
            if (nota[i] > maiorNota) {
                maiorNota = nota[i];
                maiorNot = nome[i];
            }
        }
        for (int i = 0; i < nome.length; i++) {
            if (maiorNota == nota[i]) {
                System.out.println("Alunos: "+ nome[i]);
            }
        }
        teclado.close();

    }
}
