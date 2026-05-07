import java.util.Scanner;
//Gabriel vieira reis
public class C08EX31 {
    public static void main(String[] args) {
        //chamar o arquivo txt para o programa
        Scanner arquivo = new Scanner(
                C08EX31.class.getResourceAsStream("c08ex31.txt"));
        String nome, Codcargo, outrosnome, NomeMenorSalario = " ", cargpMenor=" ";
        double salarioBruto,salAdm = 0, media =0, salarioOutros, menorSalario = 0;
        long quntEngenheiros, contC = 0,contP = 0,contO = 0,contA = 0, contX = 0,contADM=0;

        for (int i = 1; i <= 7; i++) {
            nome = arquivo.nextLine();
            Codcargo = arquivo.nextLine();
            salarioBruto = arquivo.nextDouble();
            arquivo.nextLine();

            if (i == 1 || salarioBruto < menorSalario){
                menorSalario = salarioBruto;
                NomeMenorSalario = nome;
                cargpMenor = Codcargo;
            }
            switch (Codcargo) {
                case "C":
                    if (salarioBruto >= 2500.00) {
                        contC++;
                    }
                    if (salarioBruto < 2500.00) {
                        System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                    }
                    break;
                case "P":
                    if (salarioBruto >= 4650.00) {
                        contP++;
                    }
                    if (salarioBruto > 4650.00) {
                        System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                    }
                    break;
                case "O":
                    if (salarioBruto >= 3200.00) {
                        contO++;
                    }
                    if (salarioBruto < 3200.00) {
                        System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                    }
                    break;
                case "A":
                    salAdm += salarioBruto;
                    contADM++;
                    if (salarioBruto >= 5100.00) {
                        contA++;
                    }
                    if (salarioBruto < 5100.00) {
                        System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                    }
                    break;
                case  "X":
                    if (salarioBruto > 5000.00) {
                        contX++;
                    }
                    break;
            }
        }
        media = salAdm /contADM;
        System.out.println("Acima do salário minimo para calculista: "+ contC + "\nAcima do salário minimo para Projetista:"+ contP+"\nAcima do salário minimo para obra:"+contO+"\nAcima do salário minimo para Adm:"+ contA );
        System.out.printf("Media adm: R$%.2f%n", media);
        System.out.println("Outros ganhando mais de 5000: "+contX);
        System.out.println("Nome da pessoa com menor salário: "+NomeMenorSalario + " salario: R$"+menorSalario+  " Cargo: "+cargpMenor);
    }
}
