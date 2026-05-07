//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numtabuada, tabuada;
        System.out.println("Qual valor você quer a tabuada: ");
        numtabuada = input.nextInt();
        for (int aux = 1; aux <= 9; aux++){
            tabuada = numtabuada * aux;
            System.out.println(aux + "x"+numtabuada + " = " + tabuada);
        }

    }
}