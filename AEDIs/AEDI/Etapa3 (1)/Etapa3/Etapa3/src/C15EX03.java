public class C15EX03 {
    static void main() {
        C15EX02 dog1 = new C15EX02();
        // Usando setters herdados da classe Cachorro
        dog1.setNome("Thor");
        dog1.setIdade(3);
        dog1.setRaca("Golden Retriever");
        dog1.setQuantidadePatas(4);
        dog1.setFilhote(false);
        // Usando setters da própria classe C15EX02
        dog1.setCpfDog("111.222.333-44");
        dog1.setPeso(32.5);

        // --- Cachorro 2 ---
        C15EX02 dog2 = new C15EX02();
        dog2.setNome("Luna");
        dog2.setIdade(1);
        dog2.setRaca("Bulldog Francês");
        dog2.setQuantidadePatas(4);
        dog2.setFilhote(true);
        dog2.setCpfDog("555.666.777-88");
        dog2.setPeso(12.0);

        // --- Cachorro 3 ---
        C15EX02 dog3 = new C15EX02();
        dog3.setNome("Bidu");
        dog3.setIdade(8);
        dog3.setRaca("Schnauzer");
        dog3.setQuantidadePatas(4);
        dog3.setFilhote(false);
        dog3.setCpfDog("999.888.777-66");
        dog3.setPeso(15.3);

        // ==========================================
        // 2. IMPRIMINDO E TESTANDO OS DADOS
        // ==========================================

        System.out.println("====== DADOS DOS CACHORROS ======");

        // Testando Cachorro 1
        System.out.println("\n--- Cachorro 1 ---");
        System.out.println("Nome: " + dog1.getNome());
        System.out.println("Raça: " + dog1.getRaca());
        System.out.println("CPF Dog: " + dog1.getCpfDog());
        System.out.println("Peso: " + dog1.getPeso() + " kg");
        System.out.print("Status de saúde: ");
        dog1.Saudavel();

        // Testando Cachorro 2
        System.out.println("\n--- Cachorro 2 ---");
        System.out.println("Nome: " + dog2.getNome());
        System.out.println("Raça: " + dog2.getRaca());
        System.out.println("CPF Dog: " + dog2.getCpfDog());
        System.out.println("Peso: " + dog2.getPeso() + " kg");
        System.out.print("Status de saúde: ");
        dog2.Saudavel();

        // Testando Cachorro 3
        System.out.println("\n--- Cachorro 3 ---");
        System.out.println("Nome: " + dog3.getNome());
        System.out.println("Raça: " + dog3.getRaca());
        System.out.println("CPF Dog: " + dog3.getCpfDog());
        System.out.println("Peso: " + dog3.getPeso() + " kg");
        System.out.print("Status de saúde: ");
        dog3.Saudavel();
    }
}
