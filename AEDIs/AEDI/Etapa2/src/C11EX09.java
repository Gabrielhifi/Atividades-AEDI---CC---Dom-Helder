//Gabriel Vieira Reis
import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Contadores
        int contGerencia = 0, contAdmin = 0, contPesquisa = 0, contObras = 0;
        int contAdmin2010 = 0;

        // Variáveis para controle de primeiro e último
        String primeiroNome = "", ultimoNome = "";
        int menorRF = 999999, maiorRF = -1;

        while (true) {
            System.out.print("\nNome do funcionário (ou 'fim' para encerrar): ");
            String nome = input.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Registro Funcional (6 dígitos): ");
            String rfString = input.nextLine();

            // a) Validação do Registro
            boolean erro = false;
            if (rfString.length() != 6) {
                System.out.println("REGISTRO INVÁLIDO (menos ou mais que 6 dígitos)");
                erro = true;
            } else {
                int ano = Integer.parseInt(rfString.substring(0, 2)); // Primeiros 2 dígitos
                int setor = Character.getNumericValue(rfString.charAt(2)); // Terceiro dígito

                // Valida ano (10 a 14, que representa 2010 a 2014)
                if (ano < 10 || ano > 14) {
                    System.out.println("REGISTRO INVÁLIDO (ano fora da faixa 2010-2014)");
                    erro = true;
                }
                // Valida setor (1 a 4)
                else if (setor < 1 || setor > 4) {
                    System.out.println("REGISTRO INVÁLIDO (setor não existe na tabela)");
                    erro = true;
                }

                if (!erro) {
                    // b) Contagem por setor
                    if (setor == 1) contGerencia++;
                    else if (setor == 2) {
                        contAdmin++;
                        // c) Admitidos em 2010 na Administração
                        if (ano == 10) contAdmin2010++;
                    }
                    else if (setor == 3) contPesquisa++;
                    else if (setor == 4) contObras++;

                    // e) Lógica para primeiro e último admitido (baseado na ordem do RF)
                    int rfInt = Integer.parseInt(rfString);
                    if (rfInt < menorRF) {
                        menorRF = rfInt;
                        primeiroNome = nome;
                    }
                    if (rfInt > maiorRF) {
                        maiorRF = rfInt;
                        ultimoNome = nome;
                    }
                }
            }
        }

        // Saída dos resultados
        System.out.println("\n--- RESULTADOS ESTATÍSTICOS ---");
        System.out.println("Funcionários por setor:");
        System.out.println("- Gerência: " + contGerencia);
        System.out.println("- Administração: " + contAdmin);
        System.out.println("- Pesquisa: " + contPesquisa);
        System.out.println("- Obras: " + contObras);

        System.out.println("\nAdmitidos em 2010 na Administração: " + contAdmin2010);

        // d) Setor com mais funcionários
        String maisAlocados = "Gerência";
        int max = contGerencia;
        if (contAdmin > max) { max = contAdmin; maisAlocados = "Administração"; }
        if (contPesquisa > max) { max = contPesquisa; maisAlocados = "Pesquisa"; }
        if (contObras > max) { max = contObras; maisAlocados = "Obras"; }
        System.out.println("Setor com mais funcionários: " + maisAlocados);

        // e) Primeiro e último
        System.out.println("Primeiro funcionário admitido: " + primeiroNome);
        System.out.println("Último funcionário admitido: " + ultimoNome);
    }
}