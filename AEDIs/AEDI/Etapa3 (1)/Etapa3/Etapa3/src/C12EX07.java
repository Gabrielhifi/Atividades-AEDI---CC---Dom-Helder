//Gabriel Vieira Reis
import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[10];
        int nota[] = new int[10];
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.println("Digite a nota do aluno: ");
            nota[i] = teclado.nextInt();
            teclado.nextLine();
        }
        for (int i = 0; i < nome.length; i++) {
            if (nota[i] <= 30){
                System.out.println(nome[i] +" Conceito: D");
            } else if (nota[i] <=60) {
                System.out.println(nome[i] +" Conceito: C");
            } else if (nota[i]<=80) {
                System.out.println(nome[i] +" Conceito: B");
            } else{
                System.out.println(nome[i] +" Conceito: A");
            }
        }
        teclado.close();
    }
}