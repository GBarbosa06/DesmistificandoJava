package aula020.exemplo2;

public class Cartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println(
                "Pagamento de R$" +
                valor +
                " feito com cartão de débito/crédito"
        );
    }
}
