//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, nomemaior = "";
        double custoIndividual=0, custoTotal=0, produtMaior = 0, media;
        int quntUsada, insumos;
        System.out.print("Quantos insumos utilizados: ");
        insumos = teclado.nextInt();
        for (int i = 1; i <= insumos; i++) {
            System.out.println("Qual o nome do produto: ");
            nome = teclado.next();
            System.out.println("Qual o valor do produto: ");
            custoIndividual = teclado.nextDouble();
            System.out.println("Quantos produtos foram comprados: ");
            quntUsada = teclado.nextInt();
            custoTotal = custoIndividual * quntUsada + custoTotal;
            if (i == 1 || custoIndividual > produtMaior){
                produtMaior = custoIndividual;
                nomemaior = nome;
            }
        }
        media = custoIndividual/insumos;
        System.out.println("O custo total é: R$"+custoTotal+"\nMédia dos custos Parciais: R$"+media+"\nNome do Insumo de maior custo parcial: "+nomemaior);
        teclado.close();
    }
}

