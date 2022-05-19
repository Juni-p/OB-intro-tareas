public class Main {
    public static void main(String[] args){
        int resultado;
        resultado = sumarTresValores(10,10,10);
        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        System.out.println(miCoche.puertas);
    }

    public static int sumarTresValores(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int puertas = 2;

    public void incrementarPuertas(){
        this.puertas++;
    }
}
