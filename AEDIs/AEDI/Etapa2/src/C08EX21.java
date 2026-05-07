//Gabriel Vieira Reis
import java.text.DecimalFormat;
import java.util.Scanner;
public class C08EX21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura,IMC;
        int cont=60;
        String situacao, IMCS;
        System.out.println("Digite a usa altura em metros: ");
        altura = input.nextDouble();
        System.out.println("| Peso | IMC | Situação |");
        DecimalFormat df = new DecimalFormat("#.#");
        for (int aux = 60; aux<=100; aux++){
            IMC = (aux/Math.pow(altura,2));
            if (IMC<20)
                situacao = "Abaixo do peso";
            else if (IMC <25)
                situacao = "Peso ideal    ";
            else
                situacao = "Acima do peso ";
            if (aux == cont ){
                    System.out.print("| "+aux+" | "+df.format(IMC)+" | "+situacao +" |\n");
                }
            cont++;
            }
        input.close();
        }
    }
