//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade,idade12 = 0,idade30 = 0, sumIdade=0, cont=0;
        double media;
        for (int i =1; i<=5; i++){
            System.out.print("Digite o nome do seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Digite a sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            if (idade <=12){
                idade12++;
            } else idade30++;
            sumIdade +=idade;
            cont++;
        }
        media = (double) sumIdade / cont;
        System.out.println("Alunos que tem até 12 anos = "+idade12+"\nAlunos que tem acuma de 30 anos = "+idade30+"\n Média das idades: "+media);
    }
}
