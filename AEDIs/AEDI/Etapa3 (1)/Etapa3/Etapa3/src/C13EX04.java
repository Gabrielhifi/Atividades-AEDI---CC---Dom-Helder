//Gabriel Vieira Reis
import java.util.Scanner;
public class C13EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, valor;
        int cont = 0;
        numero =  (int)(100*Math.random());
        while (true){
            System.out.println("Digite um numero: ");
            valor = input.nextInt();
            if(valor<numero){
                System.out.println("O valor é maior que o digitado!");
                cont++;
            } else if (valor > numero) {
                System.out.println("O valor é menor que o digitado!");
                cont++;
            }
            if (valor == numero){
                cont++;
                System.out.println("Você acertou em: "+cont+" tentativas;");
                break;
            }
        }
        input.close();
    }
}