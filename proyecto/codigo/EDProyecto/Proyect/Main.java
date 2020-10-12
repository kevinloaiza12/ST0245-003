package Proyect;

public class Main {

    public static void main(String[] args) {

        Datos.readData();

        int[] vArray = new int[]{13,45,65,66,67,68,69,70,71,72,73};

        for(int i = 0; i < vArray.length; i++){

            try{
                System.out.println(Datos.vConditions.get(vArray[i]) + ": " + ImpGini.getGiniImpurity(vArray[i], Estadisticas.getMediaAritmetica(Estadisticas.getUnsortedValues(vArray[i]))));
            } catch (NumberFormatException e){

                System.out.println(Datos.vConditions.get(i) + " dio error.");
            }
        }
    }
}