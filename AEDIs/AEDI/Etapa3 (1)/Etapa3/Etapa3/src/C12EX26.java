//Gabriel Vieira Reis
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class C12EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();
        List<Double> salario = new ArrayList<Double>();
        String nome;
        double salarios, reajuste;
        do {
            System.out.println("Digite o nome: (Digite X para parar)");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                nomes.add(nome);
                System.out.println("Qual o salário: ");
                salario.add(teclado.nextDouble());
                teclado.nextLine();
            }

        }while (!nome.equalsIgnoreCase("X"));
        System.out.println("Qual o reajuste para os salários: ");
        reajuste = teclado.nextDouble();
        for (int aux = 0;aux < nomes.size();aux++) {
            if (salario.get(aux) <1000){
                reajuste = reajuste +salario.get(aux);
                salario.set(aux,reajuste);
            }
        }
        for (int aux = 0;aux < salario.size();aux++) {
            System.out.println(salario.get(aux) + " "+ nomes.get(aux));
        }
    }
}
