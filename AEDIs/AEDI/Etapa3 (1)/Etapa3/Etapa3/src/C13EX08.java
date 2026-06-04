//Gabriel Vieira Reis
import java.util.*;
public class C13EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Digite o noem do autor: ");
        nome = teclado.nextLine();
        String autor[] = nome.split(" ");
        System.out.print(autor[autor.length-1].toUpperCase()+", ");
        for (int i = 0; i<= autor.length-2; i++) {
            System.out.print(autor[i].toUpperCase().charAt(0) +".");
        }
    }
}