package lec22_java_coding_challenge_for_interview;

import java.util.ArrayList;
import java.util.List;

//follow from previous code
public class LowestNumber {
	public static int findLowestNum(int[] array){
		int min = array[0];
		for (int i = 1; i< array.length;i++){
			if (array[i] < min) min = array[i];
		}
		System.out.println(min);
		return min;
	}

	// follow the previous one
	
	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		//find lowest number from the array

		/*ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}*/
	}

}

// Nasir bhai


