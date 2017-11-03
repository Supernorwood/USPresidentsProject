package data;

import java.util.ArrayList;

public interface PresidentDAO {
	ArrayList<President> getAllPresidents();
	
	President getPresidentByTerm(int termNumber);
	President getNameByTerm(int termNumber);
	President getPartyByTerm(int termNumber);
	President getFactByTerm(int termNumber);
	President getDateInOfficeByTerm(int termNumber);
	President getTermNumberByName(String name);
}
