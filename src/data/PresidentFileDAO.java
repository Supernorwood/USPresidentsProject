package data;

import java.util.ArrayList;

import javax.servlet.ServletContext;

public class PresidentFileDAO implements PresidentDAO {
	private static final String filename = "WEB-INF/presidentList.txt";
	private ServletContext servletContext;
	private ArrayList<President> presidents;
	
	public PresidentFileDAO(){
		
	}
	
	
	
	@Override
	public ArrayList<President> getAllPresidents() {
		return presidents;
	}

	@Override
	public President getPresidentByTerm(int termNumber) {
		return presidents.get(termNumber-1);
	}

	@Override
	public String getNameByTerm(int termNumber) {
		return getPresidentByTerm(termNumber).getName();
	}

	@Override
	public String getPartyByTerm(int termNumber) {
		return getPresidentByTerm(termNumber).getParty();
	}

	@Override
	public String getFactByTerm(int termNumber) {
		return getPresidentByTerm(termNumber).getInterestingFact();
	}

	@Override
	public String getDateInOfficeByTerm(int termNumber) {
		return getPresidentByTerm(termNumber).getDatesInOffice();
	}

	@Override
	public int getTermNumberByName(String name) {
		//returns -1 if name is not present in arrayList
		for(President p : presidents) {
			if(p.getName().equals(name)) {
				return presidents.indexOf(p);
			}
		}
		return -1;
	}

}
