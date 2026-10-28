package aula028.exercicio02;

public class Pix implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Pix com sucesso!\n", valor);
    }
}
