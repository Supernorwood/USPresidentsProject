package data;

import java.util.ArrayList;

public interface PresidentDAO {
	ArrayList<President> getAllPresidents();
	
	President getPresidentByTerm(int termNumber);
}
