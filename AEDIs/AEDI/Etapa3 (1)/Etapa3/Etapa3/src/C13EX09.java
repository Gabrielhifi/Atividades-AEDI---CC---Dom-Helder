//Gabriel Vieira Reis
import java.util.*;
public class C13EX09{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();
        String frasesMai[] = frase.split(" ");
        for (int i=0; i<frasesMai.length; i++){;
            System.out.print(frasesMai[i].toUpperCase().charAt(0));
            System.out.print(frasesMai[i].toLowerCase().substring(1,frasesMai[i].length())+" ");
        }
    }
}
