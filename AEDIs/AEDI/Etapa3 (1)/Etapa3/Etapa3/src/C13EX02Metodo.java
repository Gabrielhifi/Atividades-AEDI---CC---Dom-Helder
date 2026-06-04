public class C13EX02Metodo {
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
}
