public class C15EX02 extends Cachorro{
    private String cpfDog;
    private double peso;

    public C15EX02(){

    }

    public C15EX02(String nome, int idade,String raca, int quantidadePatas, boolean filhote, String cpfDog, double peso){
        super(nome, idade, raca,quantidadePatas,filhote);
        this.cpfDog = cpfDog;
        this.peso = peso;
    }
    public void Saudavel(){
        if (getIdade()<5 && peso<40 &&isFilhote() == false){
            System.out.println("Cachorro muito saudável");
        }
        else
            System.out.println("Procure um veterinário agora!!!");
    }
    public String getCpfDog(){
        return this.cpfDog;
    }
    public void setCpfDog(String cpfDog){
        this.cpfDog = cpfDog;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
}


