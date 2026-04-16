package modelo;

public class PagamentoCartao implements Pagamento{
    private double valor;


    public PagamentoCartao(double valor){
        this.valor = valor; // Recebe o valor da compra
    }

    @Override
    public double calcularTotal(){
        return valor * 1.05; // Adiciona 5% de taxa
    }

    @Override 
    public void imprimirRecibo(){
        System.out.println("Pagamento em cartao");
        System.out.println("Valor original: " + valor);
        System.out.println("Total com taxa: " + calcularTotal());
    }
}