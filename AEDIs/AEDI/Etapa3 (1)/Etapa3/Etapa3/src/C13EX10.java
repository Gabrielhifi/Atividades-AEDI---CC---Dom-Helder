//Gabriel Vieira Reis
import java.util.*;
public class C13EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        System.out.println("Digite seu nome: ");
        frase = input.nextLine();
        String letras[] = frase.split("");
        for (int aux=0; aux<letras.length; aux++)
            System.out.println(letras[aux].toUpperCase());
    }
}
