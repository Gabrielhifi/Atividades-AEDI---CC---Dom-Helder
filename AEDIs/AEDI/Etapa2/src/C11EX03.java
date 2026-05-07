//Gabriel Vieira  Reis
import java.util.Scanner;
public class C11EX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(
                C11EX03.class.getClassLoader().getResourceAsStream("c11ex03.txt")
        );
        long dia, contMultaGrave=0;
        double pontos, valorTotal=0;
        String placa;
        while (input.hasNextLine()) {

            dia = input.nextLong();
            if (dia == 99) break;
            input.nextLine();
            placa = input.nextLine();
            pontos = input.nextDouble();
            input.nextLine();


            if (pontos == 3){
                System.out.println("Placa: "+placa+" Multa: R$42,00");
                valorTotal =valorTotal+ 42.00;
            }
            if (pontos == 5){
                System.out.println("Placa: "+placa+" Multa: R$108,00");
                valorTotal =valorTotal+  108.00;
            }
            if (pontos == 8){
                if (dia <= 15){
                    contMultaGrave++;
                }
                valorTotal = valorTotal+479.00;
                System.out.println("Placa: "+placa+" Multa: R$479,00");


            }
        }
        System.out.println("A quantidade de multas de 8 pontos é: "+contMultaGrave);
        System.out.println("O valor total é: "+valorTotal);
        input.close();
    }
}