//Gabriel Vieira Reis
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C12EX28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> ra = new ArrayList<String>();
        List<String> nomeAluno = new ArrayList<String>();
        String tempNome = "", tempRa = "";
        String busca = "";

        // 1. LEITURA DOS DADOS
        while (true) {
            System.out.println("Digite o nome do aluno: (Digite Fim para encerrar)");
            // Usamos nextLine() para aceitar nomes compostos (ex: "Ana Costa")
            String nome = teclado.nextLine();

            // Se digitou Fim (independente de maiúscula/minúscula), para o loop
            if (nome.equalsIgnoreCase("Fim")) {
                break;
            }

            System.out.println("Digite o RA do aluno: ");
            String registro = teclado.nextLine();

            // Adiciona nas respectivas listas
            nomeAluno.add(nome);
            ra.add(registro);
        }

        for (int aux = 0; aux < nomeAluno.size(); aux++) {
            for (int x = 0; x < nomeAluno.size() - 1; x++) {
                if (nomeAluno.get(x).compareToIgnoreCase(nomeAluno.get(x + 1)) > 0) {

                    tempNome = nomeAluno.get(x);
                    nomeAluno.set(x, nomeAluno.get(x + 1));
                    nomeAluno.set(x + 1, tempNome);

                    tempRa = ra.get(x);
                    ra.set(x, ra.get(x + 1));
                    ra.set(x + 1, tempRa);
                }
            }
        }

        System.out.println("\n--- Alunos Ordenados por Nome ---");
        for (int i = 0; i < nomeAluno.size(); i++) {
            System.out.println("Nome: " + nomeAluno.get(i) + " | RA: " + ra.get(i));
        }
        System.out.println("Digite um RA do aluno: ");
        busca = teclado.nextLine();
        int pos = ra.indexOf(busca);
        if (pos != -1) {
            System.out.println("RA na posição: " + pos+1);
        }
        else System.out.println("RA NÂO ENCONTRADO");

        teclado.close();
    }
}