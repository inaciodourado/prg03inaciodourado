
package formas;


public class Esfera extends Forma3D{
    private double raio;
    //Metodo construtor
    public Esfera(double raio){
        this.raio = raio;
    }
//Calculo   
    @Override
    public double obterArea(){
        return 4 * Math.PI * raio * raio;
    }
    //Calculo
    @Override
    public double obterVolume(){
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString(){
        return "Esfera  " + raio;
    }
}
