//Gabriel Vieira Reis
import java.util.Scanner;
public class C12EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[50];
        int nota[] = new int[50];
        double media = 0;
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.println("Digite a nota do aluno: ");
            nota[i] = teclado.nextInt();
            teclado.nextLine();
            media += nota[i];
        }
        media = media/nota.length;
        System.out.println(media);
        for (int aux=0; aux<nome.length; aux++){
            if (nota[aux]>media){
                System.out.println(nome[aux]);
            }
        }
    }
}
