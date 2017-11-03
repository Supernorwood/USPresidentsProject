package data;

import java.util.ArrayList;

public interface PresidentDAO {
	ArrayList<President> getAllPresidents();
	
	President getPresidentByTerm(int termNumber);
	String getNameByTerm(int termNumber);
	String getPartyByTerm(int termNumber);
	String getFactByTerm(int termNumber);
	String getDateInOfficeByTerm(int termNumber);
	int getTermNumberByName(String name);
}
