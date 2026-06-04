package ProjetoAEDI;

//Gabriel Vieira Reis
public class C14EX01Metodos {
    public static double funcaoX(double x){
        double resultado;
        if (x < 4){
            resultado = ((5*x)+3)/Math.sqrt(16-Math.pow(x, 2));
        } else if (x == 4) {
            resultado = 0;
        } else {
            resultado = ((5*x)+3)/Math.sqrt(Math.pow(x, 2)-16);
        }
        return resultado;
    }
    static String posicaoX(String num[], long posic) {
        String valor = "";
        for (int aux = num.length; aux >= 0; aux--) {
            if (aux == posic) {
                valor = num[aux];
            }
        }
        return valor;
    }
    static double coordDistance (double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        return distancia;
    }

}