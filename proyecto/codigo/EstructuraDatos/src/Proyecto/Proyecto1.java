package Proyecto;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Proyecto1 {
	
	private static final List<String[]> uDList = new ArrayList<>();
	
	private static final String uLName = "lite.csv";
	
	public static void readD() {
		
		File uFiles = new File(uLName);
		
		try {
			
			FileReader uFileReader = new FileReader(uFiles);
			
			@SuppressWarnings("resource")
			BufferedReader uBufferedReader = new BufferedReader(uFileReader);
			
			String uActualLine;
			
			while ((uActualLine = uBufferedReader.readLine())!=null) {
				
				Proyecto1.add(Proyecto1.uDList, uActualLine.split(";"));
			}
		}
		catch (IOException uExcept){
			
			System.out.println(uExcept.getMessage());
		}
	}
	 private static void add(List<String[]> udlist2, String[] split) {
		
	}
	 public static List<String[]> getListData() {
		    return uDList;
		  }


}
