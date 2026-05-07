//Gabriel Vieira  Reis
import java.util.Scanner;
public class C11EX07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp,menortemp=100000000,maiortemp=0,mediatemp=0,contmaior=0;
        for (int aux = 1;aux<=11;aux++){
            System.out.println("Digite a temperatura do dia: ");
            temp = input.nextDouble();
            mediatemp +=temp;
            if (temp > maiortemp) {
                maiortemp = temp;
                contmaior = 1;
            } else if (temp == maiortemp) {
                contmaior++;
            }
            if (aux ==1 || temp<menortemp){
                menortemp=temp;
            }
        }
        mediatemp=mediatemp/11;
        System.out.println("Media de temperratura: "+mediatemp);
        System.out.println("Maior temperatura: "+maiortemp+" Aparececeu: "+contmaior+"  vezes");
        System.out.println("Menor temperatura:  "+menortemp);
        System.out.println("Media>" +mediatemp);

    }
}

