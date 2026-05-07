import java.util.Scanner;
//Gabriel vieira reis
public class C08EX27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <=10; aux++){
            for (int aux2 = 1; aux2 <= 128; aux2*=2){
                for (int aux3 = 1; aux3 <= aux2; aux3++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int aux2 = 64; aux2 >= 1; aux2/=2){
                for (int aux3 = 1; aux3 <= aux2; aux3++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
    }
}