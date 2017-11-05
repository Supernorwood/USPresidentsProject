package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
public class PresidentFileDAO implements PresidentDAO {
	private static final String filename = "WEB-INF/presidentList.txt";
	private ServletContext servletContext;
	private ArrayList<President> presidents;
	
	public PresidentFileDAO(ServletContext context){
		servletContext = context;
		presidents = new ArrayList<>();
		loadPresidentsFromFile();
	}
	
	
	private void loadPresidentsFromFile() {
		InputStream is = servletContext.getResourceAsStream(filename);
		try (BufferedReader buf = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				int termNumber = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				String datesInOffice = tokens[2];
				String party = tokens[3];
				String fact = tokens[4];
				String link = tokens[5];
				String imagePath = "img/" + link;
				
				presidents.add(new President(name, termNumber, party, fact, datesInOffice, imagePath));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	
	@Override
	public ArrayList<President> getAllPresidents() {
		return presidents;
	}
	
	@Override
	public List<President> getPresidentsByParty(String partyFilter) {
		List<President> partyList = new ArrayList<>();
		for (President p : presidents) {
			if (p.getParty().equals(partyFilter)) {
				partyList.add(p);
			}
		}
		
		return partyList;
	}

	@Override
	public President getPresidentByTerm(int termNumber) {
		return presidents.get(termNumber-1);
	}
		
		
		
//		try {
//			return presidents.get(termNumber-1);
//		}
//		catch(Exception e){
//			return null;
//		}
	

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
