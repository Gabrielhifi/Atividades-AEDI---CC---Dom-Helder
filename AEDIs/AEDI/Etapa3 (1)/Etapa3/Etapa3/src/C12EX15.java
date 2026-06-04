//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX15
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String meses[] = new String[12];
        String  temp;
        for (int i = 0; i<meses.length;i++){
            meses[i] = JOptionPane.showInputDialog(null, "Digite o mês: ");
        }
        for(int i=0;i<meses.length-1;i++){
            for(int j=0;j<meses.length-1;j++){
                if(meses[i].compareToIgnoreCase(meses[j+1])>0){
                    temp = meses[j];
                    meses[j] = meses[j+1];
                    meses[j+1] = temp;
                }
            }
        }
        for (int i = 0; i<meses.length;i++){
            System.out.println(meses[i]);
        }
        teclado.close();
    }
}
