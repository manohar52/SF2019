package codingcompetition2019;

import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class DisasterDescription {
	private int Num;
	private List<List<String>> listOLists = new ArrayList<List<String>>();
	private List<String> rowData = new ArrayList<String>();
	public List getList() {
		return this.listOLists;
	}
	public void setList(List<List<String>> l) {
		this.listOLists = l;
	}
	public int getReportedIncidentsNum() {
		return this.Num; 
	}
	public void setReportedIncidentsNum(int x) {
		this.Num = x; 
	}
	
	public String getYear() {
		int mostImpactfulYear = 1900,year,reportedDisasters = 0;
		for(List rowData: this.listOLists) {
			String temp = rowData.get(2).toString();
			year = Integer.parseInt(temp);
			if (Integer.parseInt(rowData.get(3).toString()) > reportedDisasters) {
				reportedDisasters = Integer.parseInt(rowData.get(3).toString());
				mostImpactfulYear = year;
			}			
		}
		
		return Integer.toString(mostImpactfulYear);
	}
		
	public String getCategory() {
		int sum = 0,i;
		int idx = 0;
		int prev = 0;
		String tosend = "";
		int bigger = 0;

		for(List rowData: this.listOLists) {
			if(idx == 0) {
				idx+=1;
				continue;
			}
			String temp = rowData.get(3).toString();
			String cat = rowData.get(0).toString();
			i = Integer.parseInt(temp);
			if(i > bigger) {
				bigger = i;
				tosend = cat;
			}
		}
		return tosend;
		
	}
	
}
