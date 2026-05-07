//Gabriel Vieira Reis
import java.util.Scanner;

public class C08EX03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        long nota, falta, resut, cont1=0, cont2=0;
        for (int repeticao = 1; repeticao<=50; repeticao++ ){
            System.out.println("Digite a sua nota final: ");
            nota = teclado.nextLong();
            if (nota == -1){
                break;}
            System.out.println("Digite quantas faltas você possi: ");
            falta = teclado.nextLong();
            if (nota >=65 && falta <=16){
                System.out.println("Aprovado");
                cont1++;
            }else{
                System.out.println("Reprovado");
                cont2++;
            }

        }

        System.out.println("Quantidade de alunos que foram aprovados: "+cont1+"\n Quantidade de alunos que foram reprovados: "+cont2);
        teclado.close();
    }
}