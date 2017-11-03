package data;

import java.util.ArrayList;

import javax.servlet.ServletContext;

public class PresidentFileDAO implements PresidentDAO {
	private static final String filename = "WEB-INF/stocks.txt";
	private ServletContext servletContext;
	private ArrayList<President> presidents;
	
	
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
		
		return null;
	}

	@Override
	public String getFactByTerm(int termNumber) {
		
		return null;
	}

	@Override
	public String getDateInOfficeByTerm(int termNumber) {
		
		return null;
	}

	@Override
	public String getTermNumberByName(String name) {
		
		return null;
	}

}
