import java.util.Scanner;
//Gabriel vieira reis
public class C08EX28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numero, numtotal = 1,media=0, cont = 0;
        for (int aux = 1; aux <= 1000; aux++) {
            numero = (aux-1)*aux*(aux+1);
            if (numero>0&&numero<1000){
                numtotal += numero;
                System.out.println(numero);
                cont++;}
        }
        media = numtotal / cont;
        System.out.println("MEDIA: "+media);
        teclado.close();
    }
}
