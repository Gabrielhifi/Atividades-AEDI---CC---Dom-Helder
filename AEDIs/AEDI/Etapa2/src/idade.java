import java.util.Scanner;
public class idade {
    public static void main(String[] args){
        Scanner  teclado = new Scanner(System.in);
        String nome;
        long idade, dias,anoNasc, anoatual;
        System.out.println("Qual o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Qual ano vocêe nasceu: ");
        anoNasc  = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Qual ano   estamos: ");
        anoatual  = teclado.nextLong();
        idade = anoatual -  anoNasc;
        dias = idade * 365;
        System.out.println("A sua idade é:  "+idade  + "\nVocê está na terra à: "+dias+" dias");

    }
}
