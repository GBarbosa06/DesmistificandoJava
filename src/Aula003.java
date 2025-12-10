public class Aula003 {
    public static void main(String[] args) {
        String nome = "Guilherme";
        String nome2 = "Marcos";
        String saudacao = "Olá, meu nome é ";
        saudacao = saudacao + nome;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Olá, meu nome é ");
        stringBuilder.append(nome);
        System.out.println(stringBuilder.toString());


        System.out.printf("Olá, meu nome é %s. %nTenho %d anos e %.2f de altura", "Guilherme", 19, 1.75);
    }
}
