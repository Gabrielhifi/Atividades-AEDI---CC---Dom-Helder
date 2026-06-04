//Gabriel Vieira Reis
import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[]= new String[5];
        int pontuacao[] = new int[5];
        int temp = 0;
        String tempNome = "", timeProcurar = "";
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do time: ");
            nome[i] = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Digite a pontuação do time: ");
            pontuacao[i] = teclado.nextInt();
        }
        for (int aux=0; aux<nome.length-1; aux++)
            for (int x=0; x<nome.length-1; x++)
                if (pontuacao[x] < pontuacao[x+1]) {
                    temp = pontuacao[x];
                    pontuacao[x] = pontuacao[x];
                    pontuacao[x] = temp;
                    tempNome = nome[x];
                    nome[x] = nome[x+1];
                    nome[x+1] = tempNome;
                }

        int pos = -1;
        teclado.nextLine();
        System.out.println("Digite o time que deseja procurar: ");
        timeProcurar = teclado.nextLine();
        for (int aux=0; aux<nome.length; aux++){
            if (tempNome.equalsIgnoreCase(nome[aux])){
                pos = aux;
                break;
            }
        }
        if (pos == -1){
            System.out.println("Time não encontrado na tabela");
        }else {
            if (pos <4){
                System.out.println("Time: "+timeProcurar +" esta na posição: "+ (pos+1) +" e classificado para a Copa Libertadores!");
            }else if (pos <12){
                System.out.println("Time: "+timeProcurar +" esta na posição: "+ (pos+1) +" e classificado para a Copa Sul-americana!");
            }else {
                    System.out.println("Time: "+timeProcurar +" esta na posição: "+ (pos+1) +" e rebaixado!");
                }
            }
        teclado.close();
        }

    }
