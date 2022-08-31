public class Main {
    public static void main(String[] args) {
        /* System.out.println(tipoNumero(-3)); */
        /* recorriendoNumeros(-5); */
        /* int resultados = recorriendoNumeros2(-5); */
        /* System.out.println(resultados); */
        /* recorriendoNumerosFor(0); */
        trabajandoSwitch("asdasd");
    }
    public static String tipoNumero(int numeroIf){
        String resultado="";

        if(numeroIf==0){
            resultado = "cero";
        }

        if(numeroIf>0){
            resultado ="positivo";
        }

        if(numeroIf<0){
            resultado ="negativo";
        }

        return resultado;
    }
    public static String recorriendoNumeros(int numeroWhile){

        while (numeroWhile<3){
            numeroWhile++;

            System.out.println(numeroWhile);
        }
        return "finalizado";
    }
    public static int recorriendoNumeros2(int numeroWhile){
        while (numeroWhile<3){
            numeroWhile++;
        }
        return numeroWhile;
    }
    public static String recorriendoNumerosFor(int numeroFor){
        int i=numeroFor;
        for(;i<=3;i++){
            System.out.println(i);
        }

        return "finalizado...";
    }
    public static String trabajandoSwitch(String estacion){
        switch (estacion){
            case "Primavera":
                System.out.println("Estación del año: "+ estacion);
                break;
            case "Verano":
                System.out.println("Estación del año: "+ estacion);
                break;
            case "Invierno":
                System.out.println("Estación del año: "+ estacion);
                break;
            case "Otoño":
                System.out.println("Estación del año: "+ estacion);
                break;
            default:
                System.out.println("No existe la estación del año: "+ estacion);
        }

        return "";
    }
}