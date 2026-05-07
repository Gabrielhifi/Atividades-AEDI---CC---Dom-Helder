import java.util.Scanner;
//Gabriel Vieira Reis
public class C08EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(
                C08EX15.class.getResourceAsStream("c08ex15.txt"));
        String nome, cargo, maiorsalario = " ", cargoMaior = " ";
        double salario, media=0, maiorsalarioN  = 0;
        long idade, salamed = 0, cont =  0;
        while (teclado.hasNextLine()){
            nome = teclado.nextLine();
            if (nome.trim().isEmpty()) {
                continue;
            }
            cargo = teclado.nextLine();
            if (cargo.trim().isEmpty()) {
                continue;
            }
            salario = teclado.nextDouble();
            idade = teclado.nextLong();
            if (salario  > 10000 && idade > 50){
                System.out.println("O funcionário: "+ nome  +  " é SENIOR");
            }
            if (idade <= 18){
               salamed  +=salario;
               cont++;
            }
            if (salario > maiorsalarioN){
                maiorsalarioN = salario;
                maiorsalario = nome;
                cargoMaior = cargo;
            }
        }
        media = salamed/cont;
        System.out.println("Médiaa dee salario até 18  anos R$"+ media);
        System.out.println("O "+ maiorsalario+" possui o maior salário, ganhando: R$"+maiorsalarioN+" de cargo: "+cargoMaior);
    }
}