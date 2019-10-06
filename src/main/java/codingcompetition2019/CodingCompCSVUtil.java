package codingcompetition2019;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingCompCSVUtil {
	public List<List<String>> readCSVFileByCountry(String fileName, String countryName) throws IOException {
		// TODO implement this method
		return null;
	}
	
	public List<List<String>> readCSVFileWithHeaders(String fileName) throws IOException {
		// TODO implement this method
		return null;
	}
	
	public List<List<String>> readCSVFileWithoutHeaders(String fileName) throws IOException {
		// TODO implement this method
		List<List<String>> listOLists = new ArrayList<List<String>>();
		List<String> rowData = new ArrayList<String>();
			
		
		File file = new File(fileName);
		Scanner inputStream = new Scanner(file);
		inputStream.next();
		while (inputStream.hasNext()) {
			String data = inputStream.next();
			String[] values = data.split(",");
			int i = 0;
			while (values[i] != null) {
				rowData.add(values[i]);
				i++;
			}
			listOLists.add((ArrayList<String>) rowData);	
			rowData.clear();
		}
		
		return listOLists;
	}
	
	public DisasterDescription getMostImpactfulYear(List<List<String>> records) {
		// TODO implement this method
		return null;
	}

	public DisasterDescription getMostImpactfulYearByCategory(String category, List<List<String>> records) {
		// TODO implement this method
		return null;
	}

	public DisasterDescription getMostImpactfulDisasterByYear(String year, List<List<String>> records) {
		// TODO implement this method 
		return null;
	}

	public DisasterDescription getTotalReportedIncidentsByCategory(String category, List<List<String>> records) {
		// TODO implement this method
<<<<<<< HEAD
		
		return null;
=======
		int sum=0;
		DisasterDescription dd;
		for(List rowData:records){
			if(rowData.get(0) == category) {
				
			}
//			int i = (Integer) rowData.get(3);
//			sum+= i;
		}
		return sum;
>>>>>>> branch 'master' of https://github.com/manohar52/SF2019.git
	}
	
	/**
	 * This method will return the count if the number of incident falls within the provided range.
	 * To simplify the problem, we assume:
	 * 	+ A value of -1 is provided if the max range is NOT applicable.
	 *  + A min value can be provided, without providing a max value (which then has to be -1 like indicated above).
	 *  + If a max value is provided, then a max value is also needed.
	 */
	public int countImpactfulYearsWithReportedIncidentsWithinRange(List<List<String>> records, int min, int max) {
		// TODO implement this method
		return -1;
	}
	
	public boolean firstRecordsHaveMoreReportedIndicents(List<List<String>> records1, List<List<String>> records2) {
		// TODO implement this method
		return false;
	}
}
