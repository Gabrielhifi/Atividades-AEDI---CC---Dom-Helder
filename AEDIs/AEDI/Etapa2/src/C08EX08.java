//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long nota, falta, media, flatamais16=0, totalaprov = 0, cont=0;
        for (int i = 1; i <= 50; i++) {
            System.out.println("Digite a sua nota: ");
            nota = teclado.nextLong();
            System.out.println("Digite a sua falta: ");
            falta = teclado.nextLong();
            if (nota >= 65 && falta <=16){
                System.out.println("APROVADO");
                totalaprov += nota;
                cont++;
            }else System.out.println("REPROVADO");
            if (falta >= 16){
                flatamais16++;
            }
        }
        media = totalaprov/cont;
        System.out.println("A média das notas dos aprovados é = "+media);
        System.out.println("Quantidade de alunos com mais de 16 faltas = "+flatamais16);
    }
}
