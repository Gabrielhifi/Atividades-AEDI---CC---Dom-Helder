//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX05a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Fulano = 0, Ciclano = 0,nulo2=0, Beltrano = 0,result2=0, voto, voto2 = 0, result, nulo = 0, Snulo = 0, Fulano2 = 0, Ciclano2 = 0, Beltrano2 = 0;
        //primeira votação
        for (int cont = 1; cont <= 100; cont++) {
            System.out.println("Digite o número do seu candidato: ");
            voto = teclado.nextInt();
            if (voto == -10){
                break;
            }
            switch (voto) {
                case 1:
                    Fulano++;
                    break;

                case 2:
                    Ciclano++;
                    break;

                case 3:
                    Beltrano++;
                    break;
                default:
                    nulo++;
                    break;

            }
        }
        if (nulo > Ciclano + Fulano + Beltrano) {
            System.out.println("Votação encerrada por haver mais votos nulos do que em candidatos");
            teclado.close();
            return;
        }
        // Descobre qual foi a maior quantidade de votos
        result = Math.max(Fulano, Math.max(Ciclano, Beltrano));

        // Verifica quantos candidatos tiveram a "result" (para ver se houve empate no 1º lugar)
        int vencedores = 0;
        if (Fulano == result) vencedores++;
        if (Ciclano == result) vencedores++;
        if (Beltrano == result) vencedores++;

        if (vencedores == 1) {
            // Se houve apenas 1 vencedor claro, declara o vencedor e encerra.
            if (result ==Fulano) System.out.println("O candidato que ganhou a eleição é: Fulano com " + result + " votos");
            else if (result == Ciclano) System.out.println("O candidato que ganhou a eleição é: Ciclano com " + result + " votos");
            else if (result == Beltrano) System.out.println("O candidato que ganhou a eleição é: Beltrano com " + result + " votos");

            teclado.close();
            return;
        }

        //segunda votação após empatar candidatos
        System.out.printf("---- 2° Votação ----\n");

        for (int cont = 1; cont <= 100; cont++) {
                System.out.println("Digite o número do seu candidato: ");
                voto2 = teclado.nextInt();
                if (voto2 == -10){
                    break;
                }
                switch (voto2) {
                    case 1:
                        Fulano2++;
                        break;
                    case 2:
                        Ciclano2++;
                        break;
                    case 3:
                        Beltrano2++;
                        break;
                    default:
                        nulo2++;
                        break;
                }

            }

        if (nulo2 > Ciclano2 + Fulano2 + Beltrano2) {
            System.out.println("Votação encerrada por haaver mais votos nulos do que em candidatos");
            teclado.close();
        }
        // Descobre qual foi a maior quantidade de votos
        result2 = Math.max(Fulano2, Math.max(Ciclano2, Beltrano2));

        // Verifica quantos candidatos tiveram a "result" (para ver se houve empate no 1º lugar)



            // Se houve apenas 1 vencedor claro, declara o vencedor e encerra.
            if (result2 ==Fulano2) System.out.println("O candidato que ganhou a eleição é: Fulano com " + result2 + " votos");
            else if (result2 == Ciclano2) System.out.println("O candidato que ganhou a eleição é: Ciclano com " + result2 + " votos");
            else if (result2 == Beltrano2) System.out.println("O candidato que ganhou a eleição é: Beltrano com " + result2 + " votos");

            teclado.close();
    }
}

