//Gabriel Vieira Reis
import java.util.Scanner;

public class C08EX04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome;
        long idade, cont1=0,cont2=0;
        for (int contador = 1; contador<=50; contador++){
            System.out.println("Qual o seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Qual a sua idade: ");
            idade = teclado.nextLong();
            if (idade <= 18)
                cont1++;
            else
                cont2++;
            teclado.nextLine();

        }
        System.out.println("Até 18 ->"+cont1+"Acima de 18 ->"+cont2);
    }
}