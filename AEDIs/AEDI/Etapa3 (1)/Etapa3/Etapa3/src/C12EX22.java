import java.util.Arrays;
import java.util.Scanner;

public class C12EX22
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String placa[] = new String[5];
        String nome[] = new  String[placa.length];
        String procura="";
        for (int aux = 0; aux < placa.length;aux++){
            System.out.println("Digite a placa do carro da vaga " + (aux+1) + ": ");
            placa[aux]= teclado.nextLine();
            System.out.println("Digite o nome do dono do carro da vaga " + (aux+1) + ": ");
            nome[aux]= teclado.nextLine();
        }
        int pos = -1;
        System.out.println("Digite o nome do morador ou a placa do carro: ");
        procura = teclado.nextLine();
        for (int aux = 0; aux < placa.length;aux++){
            if (procura.equalsIgnoreCase(placa[aux])|| procura.equalsIgnoreCase(nome[aux])){
                pos = aux;
                break;
            }
        }
        if (pos == -1){
            System.out.println("Carro/Pessoa não encontrada, não deixe entrar!");
        }else System.out.println("LIBERADA A ENTRADA");
    }
}