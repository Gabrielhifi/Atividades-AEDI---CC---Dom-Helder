//Gabriel Vieira  Reis
import java.util.Scanner;

public class C11EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int codLiingua=0,contI=0;
        double media =  0,contaluno=0,valorI=0, valorF=0,valorE=0;
        System.out.println("Quual o nome do aluno(Para encerrar digite FIM) ");
        nome  = input.nextLine();
        while (!nome.equalsIgnoreCase("FIM")){
            System.out.println("Ddigite a opção de aula: ");
            codLiingua  = input.nextInt();
            contaluno++;
            switch (codLiingua){
                case 1:
                    System.out.println(nome+" mensalidade: R$100.00");
                    media +=100.00;
                    contI++;
                    valorI +=100;
                    break;
                case 2:
                    System.out.println(nome+" mensalidade: R$150.00");
                    media +=150.00;
                    valorF+=150;
                    break;
                case 3:
                    System.out.println(nome+" mensalidade: R$120.00");
                    media +=120.00;
                    valorE+=120;
                    break;
                default:
                    System.out.println("Código inserido é invalido");
                    continue;
            }
            input.nextLine();
            System.out.println("Quual o nome do aluno(Para encerrar digite FIM) ");
            nome  = input.nextLine();
        }
        media = media/contaluno;
        System.out.println("Inglees alunos: "+contI);
        System.out.println(media);
        System.out.println("Ingles:  "+valorI);
        System.out.println("Frances:  "+valorF);
        System.out.println("Espanhol:  "+valorE);
        input.close();
    }
}
