//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX06 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        long numeros, par=0, impar=0,div4=0,div3=0;
        for (int i = 1; i<=10;i++){
            System.out.print("Digite um valor: ");
            numeros=teclado.nextLong();
            if (numeros%2==0){
                par++;
            }else impar++;
            if (numeros%4==0){
                div4 += numeros;
            }
            if (numeros%3==0){
                div3++;
            }
        }
        System.out.println("Soma dos núemros divisiveis: "+div4+"\n Quantidade de números divisiveis por 3: "+div3+"\n Números pares: "+par+"\n Números impares: "+impar);
    }
}