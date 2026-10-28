package aula028.exercicio02;

public class Main {
    public static void main(String[] args) {
        FormaPagamento pagamentoPix = new Pix();
        FormaPagamento pagamentoCartao = new Cartao();

        System.out.println("=== Processamento de Pagamentos ===");
        pagamentoPix.pagar(150.00);
        pagamentoCartao.pagar(329.90);
    }
}
