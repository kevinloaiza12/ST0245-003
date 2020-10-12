package Proyect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Datos {


    public static final List<String[]> vDataList = new ArrayList<>();
    private static final String vPathName = "Proyect/lite.csv";
    public static final List<String> vConditions = new ArrayList<>();

    public static void readData(){

        File vDataFile = new File(vPathName);

        try {

            FileReader vFileReader = new FileReader(vDataFile);
            BufferedReader vBufferedReader = new BufferedReader(vFileReader); //Puede causar excepciones al leer ciertos archivos sin UNICODE-8
            String vLine;
            String[] vFirstLine = vBufferedReader.readLine().split(";");

            vConditions.addAll(Arrays.asList(vFirstLine));

            while ((vLine = vBufferedReader.readLine())!=null) {

                Datos.addToList(Datos.vDataList, vLine.split(";"));
            }

        } catch (IOException vException) {

            System.out.println(vException.getMessage());
        }
    }

    public static void addToList(List<String[]> vFinalList, String[] vData){

        vFinalList.add(vData);
    }

    public static List<String[]> getDataList(){

        return Datos.vDataList;
    }

    public static String convertStringToNumberString(String vString){

        char[] vArray = vString.toCharArray();
        StringBuilder vTemp = new StringBuilder();

        for(char a : vArray){

            switch (a){

                case '1':
                    vTemp.append(a);
                    break;
                case '2':
                    vTemp.append(a);
                    break;
                case '3':
                    vTemp.append(a);
                    break;
                case '4':
                    vTemp.append(a);
                    break;
                case '5':
                    vTemp.append(a);
                    break;
                case '6':
                    vTemp.append(a);
                    break;
                case '7':
                    vTemp.append(a);
                    break;
                case '8':
                    vTemp.append(a);
                    break;
                case '9':
                    vTemp.append(a);
                    break;
                case '0':
                    vTemp.append(a);
                    break;
                case '.':
                    vTemp.append(a);
                    break;
            }
        }

        return vTemp.toString();
    }
}