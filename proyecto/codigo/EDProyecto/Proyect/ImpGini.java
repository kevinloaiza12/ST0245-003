package Proyect;

import java.util.ArrayList;

public class ImpGini {

    public static double getGiniImpurity(int vData, double vCondition){

        ArrayList<String> vArrayList = Estadisticas.getUnsortedValues((int) vData);

        int countRight = 0;
        int countPositiveRight = 0;
        int countNegativeRight = 0;
        int countLeft = 0;
        int countPositiveLeft = 0;
        int countNegativeLeft = 0;




        for(int i = 0; i < Datos.getDataList().size(); i++){

            String vTemp = Datos.convertStringToNumberString(vArrayList.get(i));

            if(vTemp.equals("")){

                continue;
            }

            if(Double.parseDouble(vTemp) <= vCondition){

                if(Estadisticas.getUnsortedValues(77).get(i).equals("1")) countPositiveLeft++;
                else countNegativeLeft++;

                countLeft++;

            } else{

                if(Estadisticas.getUnsortedValues(77).get(i).equals("0")) countPositiveRight++;
                else countNegativeRight++;

                countRight++;
            }
        }



        double valorLeft = 1 - (Math.pow((double)countPositiveLeft/countLeft,2) + Math.pow((double)countNegativeLeft/countLeft,2));
        double valorRight = 1 - (Math.pow((double)countPositiveRight/countRight,2) + Math.pow((double)countNegativeRight/countRight,2));

        return balancedGini(countLeft, countRight, valorLeft, valorRight);
    }

    private static double balancedGini(int leftTotal, int rightTotal, double valorLeft, double valorRight){
        return ((leftTotal*valorLeft) + (rightTotal*valorRight)) / (leftTotal + rightTotal );
    }
}

