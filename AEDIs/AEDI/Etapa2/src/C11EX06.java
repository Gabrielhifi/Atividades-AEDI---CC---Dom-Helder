//Gabriel Vieira  Reis
import java.util.Scanner;
public class C11EX06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCanal=0, pessoarAssistindo=0, tvlig,pess4=0,pess7=0,pess12=0,pessnassistido=0;
        double mediaAssistindo=0, canal4=0,canal7=0,canal12=0,porcent4=0,porcent7=0,total=0,porcent12=0;
        for (int i = 1; i<=10;i++){
            System.out.println("A Tv estava ligada e nos canais esperados? (1--sim 0--não)");
            tvlig = input.nextInt();

            if (tvlig == 0) {
                pessnassistido++;
                continue;}
            System.out.println("Número do canal assistido:  ");
            numCanal = input.nextInt();
            System.out.println("Quantidade de pessoas assistindo: ");
            pessoarAssistindo = input.nextInt();
            switch (numCanal){
                case 4:
                    canal4++;
                    pess4  +=pessoarAssistindo;
                    break;
                case 7:
                    canal7++;
                    pess7  +=pessoarAssistindo;
                    break;
                case 12:
                    canal12++;
                    pess12  +=pessoarAssistindo;
                    break;
                default:
                    System.out.println("ERRO");
                    break;
            }

            pessoarAssistindo +=pessoarAssistindo;

        }
        System.out.println("Canal 4: "+canal4);
        System.out.println("Canal 7: "+canal7);
        System.out.println("Canal 12: "+canal12);
        porcent4 =  (porcent4/total)*100;
        porcent7 =  (porcent7/total)*100;
        porcent12 =  (porcent12/total)*100;
        System.out.printf("Canal 4 com %.2f%% de audiencia%n", porcent4);
        System.out.printf("Canal 7 com %.2f%% de audiencia%n", porcent7);
        System.out.printf("Canal 12 com %.2f%% de audiencia%n", porcent12);
        if (pess4>pess7 && pess4>pess12) System.out.printf("Canal 4 mais assistido");
        else if (pess7>pess4&&pess7>pess12) System.out.printf("Canal 7 mais assistido");
        else if (pess12>pess4&&pess12>pess7) System.out.printf("Canal 12 mais assistido");
        else System.out.printf("Empate");
        mediaAssistindo = pessoarAssistindo/pessnassistido;
        System.out.print(mediaAssistindo);

    }
}
