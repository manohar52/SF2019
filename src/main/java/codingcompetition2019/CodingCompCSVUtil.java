package codingcompetition2019;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingCompCSVUtil {
	public List<List<String>> readCSVFileByCountry(String fileName, String countryName) throws IOException {
		// TODO implement this method
				List<List<String>> listOLists = new ArrayList<List<String>>();
				List<String> rowData = new ArrayList<String>();
					
				
				File file = new File(fileName);
				Scanner inputStream = new Scanner(file);
				inputStream.nextLine();
				while (inputStream.hasNextLine()) {
					rowData = new ArrayList<String>();
					String line = inputStream.nextLine();
					String[] values = line.split(",");
					int i = 0;
					int c = values.length;
					while (c!=0) {
						rowData.add(values[i]);
						i++;
						c--;
					}
					if (rowData.get(0).toString().equals(countryName)){
						listOLists.add((ArrayList<String>) rowData);
					}
						
				}
				
				return listOLists;
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
		inputStream.nextLine();
		while (inputStream.hasNextLine()) {
			rowData = new ArrayList<String>();
			String line = inputStream.nextLine();
			String[] values = line.split(",");
			int i = 0;
			int c = values.length;
			while (c!=0) {
				rowData.add(values[i]);
				i++;
				c--;
			}
			listOLists.add((ArrayList<String>) rowData);	
			
		}
		
		return listOLists;
	}
	
	public DisasterDescription getMostImpactfulYear(List<List<String>> records) {
		// TODO implement this method
		int i = 0;
		DisasterDescription dd = new DisasterDescription();
		List<List<String>> ll = new ArrayList<List<String>>();
		List<String> rowData = new ArrayList<String>();
			for (i = 0; i < records.size(); i++) {
				System.out.print(records.get(i));
				rowData = records.get(i);
			if(rowData.get(0).toString().equals("All natural disasters")) {
				ll.add(rowData);
			}
		}
		dd.setList(ll);
		return dd;
	}

	public DisasterDescription getMostImpactfulYearByCategory(String category, List<List<String>> records) {
		// TODO implement this method
		return null;
	}

	public DisasterDescription getMostImpactfulDisasterByYear(String year, List<List<String>> records) {
		// TODO implement this method
		int i = 0,sum=0;
		DisasterDescription dd = new DisasterDescription();
		List<List<String>> ll = new ArrayList<List<String>>();
		List<String> rowData = new ArrayList<String>();
			for (i = 0; i < records.size(); i++) {
				System.out.print(records.get(i));
				rowData = records.get(i);
			if(rowData.get(2).toString().equals(year)) {
				ll.add(rowData);
			}
		}
		dd.setList(ll);
		String cat = dd.getCategory();
		for(List rowData1: ll) {
			String temp = rowData1.get(0).toString();
			if(temp.equals(cat)) {
				dd.setReportedIncidentsNum(Integer.parseInt(rowData1.get(3).toString()));
			}
		}
		return dd;
	}

	public DisasterDescription getTotalReportedIncidentsByCategory(String category, List<List<String>> records) {
		// TODO implement this method
		int i = 0,sum=0;
		DisasterDescription dd = new DisasterDescription();
		List<List<String>> ll = new ArrayList<List<String>>();
		List<String> rowData = new ArrayList<String>();
		
			for (i = 0; i < records.size(); i++) {
				System.out.print(records.get(i));
				rowData = records.get(i);
			if(rowData.get(0).toString().equals(category)) {
				ll.add(rowData);
			}
		}
		dd.setList(ll);
		
		int sum1 = 0,y;
		for(List rowData1: ll) {
			String temp = rowData1.get(3).toString();
			y = Integer.parseInt(temp);
			sum1+=y;
		}
		dd.setReportedIncidentsNum(sum1);
		
		return dd;
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