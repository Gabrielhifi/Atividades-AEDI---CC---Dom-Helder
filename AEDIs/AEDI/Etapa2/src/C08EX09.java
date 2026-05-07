//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sexo;
        int idade=0, repeticoes=0, idadeM=0,idadeF=0, contM = 0, contF=0;
        double mediaM=0, mediaF=0;
        System.out.println("Digite quantas pessoas são: ");
        repeticoes = teclado.nextInt();
        teclado.nextLine();
        for (int i = 1; i <= repeticoes; i++) {

            teclado.nextLine();
            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Digite seu sexo: ");
            sexo = teclado.nextLine();
            System.out.println("Digite a sua idade: ");
            idade = teclado.nextInt();



            switch (sexo) {
                case "M":
                    idadeM += idade;
                    contM ++;
                    break;
                case "F":
                    idadeF += idade;
                    contF ++;
                    break;
            }
        }
        mediaM = (float)idadeM / contM;
        mediaF = (float)idadeF / contF;
        System.out.println("Media das idades dos HOMENS: " + mediaM+" \nMedia das idades das MULHERES: " + mediaF);
    }
}