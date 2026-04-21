
package formas;


public class Circulo extends Forma2D {
    private double raio;
    //Metodo construtor
    public Circulo(double raio){
        this.raio = raio;
    }

    //Calculo
    @Override
    public double obterArea(){
        return Math.PI * raio * raio;
    }
    
    @Override
    public String toString() {
        return "Círculo - Raio:" + raio;
    }
}