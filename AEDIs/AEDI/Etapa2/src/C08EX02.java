//Gabriel Vieira Reis
import java.util.Scanner;

public class C08EX02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        long nota, falta, resut;
        for (int repeticao = 1; repeticao<=50; repeticao++ ){
            System.out.println("Digite a sua nota final: ");
            nota = teclado.nextLong();
            if (nota == -1){
                break;}
            System.out.println("Digite quantas faltas você possi: ");
            falta = teclado.nextLong();
            if (nota >=65 && falta <=16){
                System.out.println("Aprovado");
            }else
                System.out.println("Reprovado");


        }
    }
}