//Gabriel Vieira Reis
import java.util.Locale;
import java.util.Scanner;
public class C08EX05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        long candidat1=0, candidat2=0,candidat3=0,result, nulo = 0;
        int voto;
        for (int cont = 1; cont<=100; cont++){
            System.out.println("Digite o número do seu candidato: ");
            voto = teclado.nextInt();
            switch (voto){
                case 1:
                    candidat1++;
                case 2:
                    candidat2++;
                case 3:
                    candidat3++;

                default:
                    nulo++;

            }


        }
        result =Math.max(candidat1,Math.max(candidat2,candidat3));
        if (result == candidat1){
        System.out.println("O candidato que ganhou a eleição é: Fulano com "+result+" votos");}
        else if (result == candidat2) {
            System.out.println("O candidato que ganhou a eleição é: Ciclano com "+result+" votos");}
        else if (result == candidat3) {
            System.out.println("O candidato que ganhou a eleição é: Beltrano com "+result+" votos");}
        }
    }
