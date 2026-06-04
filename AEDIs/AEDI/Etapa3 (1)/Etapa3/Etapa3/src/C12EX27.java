//Gabriel Vieira Reis
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class C12EX27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Long> CPF = new ArrayList<Long>();
        List<String> endereco = new ArrayList<String>();
        long cpf, busca;
        String simeENao ="";
        do {
            System.out.println("Digite apenas os número do seu CPF:  (Quando quiser parar digite -1)");
            cpf = teclado.nextLong();
            teclado.nextLine();
            if (cpf != -1) {
                CPF.add(cpf);
                System.out.println("Digite o seu enderço: ");
                endereco.add(teclado.nextLine());
            }
        }while (cpf != -1);

        System.out.println("Digite um CPF");
        busca = teclado.nextLong();
        teclado.nextLine();

        int pos = CPF.indexOf(busca);
        if (pos == -1) {
            System.out.println("O CPF não foi encontrado");
            System.out.println("Você quer adicionar o CPF a lista? (S/N)");
            simeENao = teclado.nextLine();
            if (simeENao.equalsIgnoreCase("S")) {
                CPF.add(busca);
                System.out.println("Digite o endereço para este novo CPF: ");
                endereco.add(teclado.nextLine());
            }
        } else if (pos != -1) {
            System.out.println("CPF encontrado na posição: "+pos+1);
            System.out.println("Você deseja alterar o CPF ou excluir? (A/E)");
            simeENao = teclado.nextLine();
            if (simeENao.equalsIgnoreCase("A")) {
                System.out.println("Digite o CPF que deseja alterar: ");
                CPF.set(pos, teclado.nextLong());
            }else if (simeENao.equalsIgnoreCase("E")) {
                CPF.remove(pos);
                endereco.remove(pos);
            }
        }
        System.out.println("\n--- Lista de Cadastros ---");
        for (int i = 0; i <= CPF.size() - 1; i++) {
            System.out.println("CPF: " + CPF.get(i) + "| Endereço: " + endereco.get(i));
        }
        teclado.close();
    }
}