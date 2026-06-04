public class Cachorro {

    // 1. Atributos privados (Encapsulamento)
    private String nome;
    private int idade;
    private String raca;
    private int quantidadePatas;
    private boolean filhote;

    public Cachorro() {
    }    // 2. Construtor
    public Cachorro(String nome, int idade, String raca, int quantidadePatas, boolean filhote) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.quantidadePatas = quantidadePatas;
        this.filhote = filhote;
    }

    // 3. Métodos de Ação
    public void falar() {
        System.out.println("Auuuuuu");
    }

    public void andar() {
        System.out.println("Andou");
    }

    // 4. Getters e Setters (As "portas de acesso" aos atributos)

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getQuantidadePatas() {
        return this.quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    // Nota: Em Java, o "getter" de um boolean geralmente se chama "is" em vez de "get"
    public boolean isFilhote() {
        return this.filhote;
    }

    public void setFilhote(boolean filhote) {
        this.filhote = filhote;
    }
}