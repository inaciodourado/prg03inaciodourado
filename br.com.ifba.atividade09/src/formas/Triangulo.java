
package formas;


public class Triangulo extends Forma2D{
    public double lado, altura;
    //Metodo construtor
    public Triangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }
    //Calculo
    @Override
    public double obterArea(){
        return (lado * altura) / 2;
    }
    
    @Override 
    public String toString(){
        return "Triangulo - " + lado + "Altura - " + altura;
    }
}
