package aula020.exemplo2;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new Pix(),
                new Cartao(),
                new Dinheiro()
        };

        for (Pagamento pagamento : pagamentos){
            pagamento.pagar(50);
        }
    }
}
