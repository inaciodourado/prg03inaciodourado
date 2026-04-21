
package formas;

public class Quadrado extends Forma2D{
    private double lado;
    //Metodo construtor
    public Quadrado(double lado){
        this.lado= lado;
    }
    //Calculo
    @Override 
    public double obterArea(){
        return lado * lado;
    }
    
    @Override
    public String toString(){
        return "Quadrado - " + lado;
    }
}
