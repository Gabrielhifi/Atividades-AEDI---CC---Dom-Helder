//Gabriel Vieira Reis
import java.util.*;
public class C13EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sobrenome;
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        String nomeCompleto[] = nome.split(" ");
        sobrenome = nomeCompleto[nomeCompleto.length-1];
        System.out.println(nome +" \n"+sobrenome);
    }
}