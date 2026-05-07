//Gabriel Vieira  Reis
import java.util.Scanner;


public class C11EX04b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, sexo,nomevelho="";
        long idade, pntsCarteira,idadVelho=0,contIdade=0;
        double multaValor,mediaIdade=0,percentH=0,contH=0,contF=0,valortt=0;
        for (int aux=1; aux<=230;aux++){
            System.out.println("Digite o seu nome: ");
            nome = input.nextLine();
            if (nome.equalsIgnoreCase("X"))break;
            System.out.println("Digite a sua idade: ");
            idade = input.nextLong();

            input.nextLine();
            System.out.println("Qual o seu sexo(M ou F) ");
            sexo = input.nextLine();
            System.out.println("Quantos pontos você perdeu: ");
            pntsCarteira = input.nextLong();
            System.out.println("Valor da multa: R$");
            multaValor = input.nextDouble();
            valortt+=multaValor;
            mediaIdade += idade;
            contIdade++;
            if (aux ==1||idade>idadVelho){
                idadVelho = idade;
                nomevelho = nome;
            }
            if (sexo.equalsIgnoreCase("M")){
                contH++;
            }
            if (sexo.equalsIgnoreCase("F")&& pntsCarteira >=7){
                contF++;
            }
        }
        mediaIdade = mediaIdade/contIdade;
        percentH = contH/(contH+contF);
        System.out.println("Média das idades: "+mediaIdade);
        System.out.println("Valor total das multas: "+valortt);
        System.out.println("Homens multados: "+ percentH);
        System.out.println("Mulheress com mais de 7 pontos na carteir: "+contF);
        System.out.println("Idade mais velha:  "+idadVelho+ " nome: "+nomevelho);
        input.close();

    }
}
