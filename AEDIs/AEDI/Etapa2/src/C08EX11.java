//Gabriel Vieira Reis

import javax.swing.JOptionPane;

public class C08EX11 {

    public static void main(String[] args) {

        String noome, idades, salarios, nomeMaior =" ", nomeMenos =  " ";

        String[] sexo = {"M", "F"}, estadoCivil  = {"C", "S","O"},cordosolhos = {"A", "C","P","O"}, cordoCabelo ={"L","P","C","R"}, escolaridade = {"1 - analfabeto","2 - fundamental","3 - medio","4 - superior"};
        int idade, sexos, estadoCiv, olhoscor, cabellocor, eesccolaridade, contMulher = 0;
        double salario, maiorsalar = 0, menorsalario = 0, diferca = 0;
        for (int aux = 1; aux <=3;aux++) {
            noome = JOptionPane.showInputDialog("Digite o nome: ");
            salarios = JOptionPane.showInputDialog("Digite o seu salário: ");
            salario = Integer.valueOf(salarios);
            idades = JOptionPane.showInputDialog("Digite a sua idade: ");
            idade =  Integer.valueOf(idades);
            sexos = JOptionPane.showOptionDialog(null,
                    "Qual o seu sexo",
                    "Exercicio",
                    0,
                    JOptionPane.QUESTION_MESSAGE, null, sexo, " ");
            estadoCiv = JOptionPane.showOptionDialog(null,
                    "Qual o seu estado civil (C  - Casado / S -  Solteiro / O - outros)",
                    "Exercicio",
                    0,
                    JOptionPane.QUESTION_MESSAGE, null, estadoCivil, " ");
            olhoscor = JOptionPane.showOptionDialog(null,
                    "Qual a coor do seu olho: (A - Azul  /  C - Castanho / P - preto / O -outros)",
                    "Exercicio",
                    0,
                    JOptionPane.QUESTION_MESSAGE, null, cordosolhos, " ");
            cabellocor = JOptionPane.showOptionDialog(null,
                    "Qual a cor do seu cabelo",
                    "Exercicio",
                    0,
                    JOptionPane.QUESTION_MESSAGE, null, cordoCabelo, " ");
            eesccolaridade = JOptionPane.showOptionDialog(null,
                    "Qual sua escollaridade",
                    "Exercicio",
                    0,
                    JOptionPane.QUESTION_MESSAGE, null, escolaridade, " ");
            if (sexos == 1 && estadoCiv == 1 && olhoscor == 0 && cabellocor == 0 && salario >= 10000 && idade >= 18 && idade <=25){
                contMulher++;
            }
            if (aux ==1 || salario > maiorsalar){
                maiorsalar = salario;
                nomeMaior =  noome;
            }
            if (aux==1 || salario<menorsalario){
                menorsalario  = salario;
                nomeMenos = noome;
            }
        }
        System.out.print("A quantidade de mulheres comos padrões é: " + contMulher);
        System.out.print("\nO nome da pessoa ccom maior salário é: " + nomeMaior + "  Com o salario de: R$"+maiorsalar);
        System.out.print("\nDiferença entre maior e menor salario: "+  (diferca = maiorsalar - menorsalario));
    }

}