package modelo;

public class PagamentoPix implements Pagamento{
    private double valor; // Valor original
    
    public PagamentoPix(double valor){
        this.valor = valor; // Recebe o valor da compra
    }
    
    @Override
    public double calcularTotal(){
        return valor * 0.98; // Aplica 2% de cashback
    }
    
    @Override 
    public void imprimirRecibo(){
        System.out.println("Pagamento com pix");
        System.out.println("Valor original: " + valor);
        System.out.println("Total com cashback: " + calcularTotal());
    }
}

