package codingcompetition2019;

import java.util.List;
import java.util.ArrayList;

public class DisasterDescription {
//	private List list = new ArrayList();
	private List<List<String>> listOLists = new ArrayList<List<String>>();
	private List<String> rowData = new ArrayList<String>();
	public List getList() {
		return this.listOLists;
	}
	public void setList(List l) {
		this.listOLists = l;
	}
	public int getReportedIncidentsNum() {
		int sum = 0;
		for(List rowData: this.listOLists) {
			int i = (Integer)rowData.get(3);
			sum+=i;
		}
		return sum;
	}
	
}
