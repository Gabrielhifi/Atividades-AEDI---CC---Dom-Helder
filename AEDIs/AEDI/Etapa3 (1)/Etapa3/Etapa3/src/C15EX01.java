public class C15EX01 {

    public static void main(String[] args) {

        // 1. O cachorro nasce "vazio" (sem dados na memória ainda)
        Cachorro objeto = new Cachorro();

        // 2. Preenchendo os dados aos poucos usando os Setters
        objeto.setNome("Rex");
        objeto.setIdade(3);
        objeto.setRaca("Labrador");
        objeto.setQuantidadePatas(4);
        objeto.setFilhote(false);

        // 3. Testando se os dados foram salvos corretamente
        System.out.println("Nome do cachorro: " + objeto.getNome());
        System.out.println("Idade: " + objeto.getIdade() + " anos");

        // Chamando os métodos normais
        objeto.falar();
        objeto.andar();
    }
}