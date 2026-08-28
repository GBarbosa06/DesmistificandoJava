package aula020.exemplo2;

public class Dinheiro  implements Pagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito com dinheiro");
    }
}
