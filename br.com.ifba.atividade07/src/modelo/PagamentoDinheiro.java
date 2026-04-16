package modelo;

public class PagamentoDinheiro implements Pagamento {
    private double valor;

    
    public PagamentoDinheiro(double valor){
        this.valor = valor; // Recebe o valor da compra
}
    
    @Override
    public double calcularTotal(){
        return valor * 0.9; //Aplica 10% de desconto 
}
    
    @Override
    public void imprimirRecibo(){
        System.out.println("Pagamento em dinheiro");
        System.out.println("Valor original: " + valor);
        System.out.println("Total com desconto: " + calcularTotal());
    }
}