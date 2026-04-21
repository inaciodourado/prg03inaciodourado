package formas;

public class Cubo extends Forma3D{
    private double lado;
    //Metodo construtor
    public Cubo(double lado){
        this.lado = lado;
    }
    //Calculo
    @Override
    public double obterArea(){
        return 6 * lado * lado;
    }
    //Calculo
    @Override
    public double obterVolume(){
        return lado * lado * lado;
    }

    @Override
    public String toString(){
        return "Cubo - " + lado;
    }
}
