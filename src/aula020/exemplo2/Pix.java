package aula020.exemplo2;

public class Pix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$%.2f via Pix%n", valor);
    }
}
