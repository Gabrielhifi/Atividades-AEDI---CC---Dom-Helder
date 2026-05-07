//Gabriel Vieira  Reis
import java.util.Scanner;
public class C11EX02b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, nomeMenos=" ";
        double valoraplicacao,media=0, contMenos=1000;
        long contB=0, contP=0, contO=0;

        do {
            System.out.println("Digite o nome do cliente: ");
            nome = input.nextLine();
            System.out.println("Digite o valor aplicado: ");
            if (nome.equalsIgnoreCase("Reynaldo")){
                break;
            }
            valoraplicacao = input.nextDouble();
            input.nextLine();
            if (valoraplicacao<=1000.00){
                System.out.println(nome+" sua classificação é Bronze");
                contB++;
                media += valoraplicacao;
                if (valoraplicacao<contMenos){
                    contMenos =valoraplicacao;
                    nomeMenos = nome;
                }
            }
            else if(valoraplicacao<5000){
                System.out.println(nome+" sua classificação é Prata");
                contP++;
            }
            else {
                System.out.println(nome+" sua classificação é Ouro");
                contO++;
            }
        }while (!nome.equalsIgnoreCase("Reynaldo"));
        System.out.println("A classificação Bronze possui: "+contB+" Pessoas"+"A classificação Prata possui: "+contP+" Pessoas"+"A classificação Ouro possui: "+contO+" Pessoas");
        media = media/contB;
        System.out.println("Media: "+media);
        System.out.println("Foram feitas: "+(contB+contO+contP)+" Aplicações");
        System.out.println("Menor aplicação de: "+nomeMenos);
        input.close();
    }
}
