package aula028.exercicio02;

public class Cartao implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Cartão com sucesso!\n", valor);
    }
}
