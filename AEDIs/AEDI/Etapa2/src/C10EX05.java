//Gabriel Vieira  Reis

import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, media=0;
        long contF=0, contH=0, acimPeso=0, ccontpeeople=0;
        String sexo="", nome;
        System.out.println("Para encerrar o programa digite: ACABOU no nome");
        do {
            System.out.println("Qual o nome do funcionário: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("acabou"))break;
            System.out.println("Qual altura dele: ");
            altura  = teclado.nextDouble();
            teclado.nextLine();
            System.out.println("Qual o peso dele:  ");
            peso = teclado.nextDouble();
            System.out.println("Ele é M(Masculino) ou F(feminino): ");
            sexo = teclado.nextLine();
            if (sexo.equalsIgnoreCase("F")) {
                contF++;
                if (peso < 60){acimPeso++;}
            }

            else if (sexo.equalsIgnoreCase("M")) {
                media += altura;
                contH++;
            }
            teclado.nextLine();

            ccontpeeople++;
        }while (true);
        System.out.println("Foram pesquisadas um total de: "+ ccontpeeople + " pessoas");
        System.out.println("Quantidade dee mulheeres:  "+ contF);
        System.out.println("Altura media dos  homens: "+ media/contH);
        System.out.println("Quantidade de mulheeres até 60Kg: "+ acimPeso);
    }
}