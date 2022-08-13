public class Main {
    /*
    public static void main(String[] args) {
        int resultado=0;
        resultado=sumatoria(1,2,3);
        System.out.println(resultado);
    }
    public static int sumatoria(int a, int b, int c){
        return a+b+c;
    }
    */

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.sumarPuerta();

        System.out.println(miCoche.puertas);
    }
}

class Coche{
    public int puertas=0;

    public void sumarPuerta(){
        this.puertas++;
    }

}