package data;

import java.util.ArrayList;
import java.util.List;

public interface PresidentDAO {
	List<President> getAllPresidents();
	
	President getPresidentByTerm(int termNumber);
	String getNameByTerm(int termNumber);
	String getPartyByTerm(int termNumber);
	String getFactByTerm(int termNumber);
	String getDateInOfficeByTerm(int termNumber);
	int getTermNumberByName(String name);
}
