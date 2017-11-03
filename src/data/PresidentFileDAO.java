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
	public President getNameByTerm(int termNumber) {
		
		return null;
	}

	@Override
	public President getPartyByTerm(int termNumber) {
		
		return null;
	}

	@Override
	public President getFactByTerm(int termNumber) {
		
		return null;
	}

	@Override
	public President getDateInOfficeByTerm(int termNumber) {
		
		return null;
	}

	@Override
	public President getTermNumberByName(String name) {
		
		return null;
	}

}
