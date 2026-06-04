//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C12EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[10];
        String procura = "";
        for (int i=0; i<nome.length; i++){
            nome[i] = JOptionPane.showInputDialog(null,"Digite o nome de quem está na fila: ");
        }
        procura = JOptionPane.showInputDialog(null,"Digite o nome que queira saber: ");
        int pos = -1;
        for (int i=0; i<nome.length; i++){
            if (nome[i].equalsIgnoreCase(procura)){
                pos = i;
                break;
            }
        }
        if (pos==-1){
            System.out.println("Pessoa não encontrada");
        }else {
            System.out.println("Nome: "+nome[pos] +" esta na posição: "+ pos+1);
        }
    }
}
