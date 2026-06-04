//Gabriel Vieira Reis
import java.util.*;
public class C13EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sobrenome;
        int cont = 0, num=0;
        System.out.println("Digite um sobrenome");
        sobrenome = teclado.nextLine();
        while (true){
            System.out.println("Digite um nome: (Digite X para encerrar)");
            nome = teclado.nextLine();
            String nomeCompleto[] = nome.split(" ");
            if(nome.equalsIgnoreCase("X")){
            break;}

            num = nome.indexOf(sobrenome);
            if (num != -1){
                if (nomeCompleto[nomeCompleto.length-1].equalsIgnoreCase(sobrenome)){
                    cont++;
                }
            }
        }
        System.out.println("Existem "+ cont + " que podem ser seus parentes.");
    }
}