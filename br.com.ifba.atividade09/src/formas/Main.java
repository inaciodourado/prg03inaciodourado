
package formas;

public class Main {
    public static void main(String[] args) {
        //Array das formas, ja com o valor a ser calculado 
        Forma[] formas = new Forma[5];

        formas[0] = new Circulo(2);
        formas[1] = new Quadrado(3);
        formas[2] = new Triangulo(4, 5);
        formas[3] = new Esfera(2);
        formas[4] = new Cubo(3);
        //Anda na array
        for (Forma f : formas) {
            System.out.println(f.toString());
            //Instanceof para verificar se é 2D, se for imprime somente area
            if (f instanceof Forma2D) {
                Forma2D f2 = (Forma2D) f;
                System.out.println("Área: " + f2.obterArea());
            }
            //Instanceof para verificar se é 3D, se for imprime area e volume
            if (f instanceof Forma3D) {
                Forma3D f3 = (Forma3D) f;
                System.out.println("Área: " + f3.obterArea());
                System.out.println("Volume: " + f3.obterVolume());
            }

            System.out.println("-------------------");
        }
    }
}
