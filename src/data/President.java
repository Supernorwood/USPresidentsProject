package data;

public class President {
	
	private String name;
	private int termNumber;
	private String party;
	private String interestingFact;
	private String datesInOffice;
	private String imageFile;
	
	public President(String name, int termNumber, String party, String interestingFact, String datesInOffice, String imageFile) {
		super();
		this.name = name;
		this.termNumber = termNumber;
		this.party = party;
		this.interestingFact = interestingFact;
		this.datesInOffice = datesInOffice;
		this.imageFile = imageFile;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTermNumber() {
		return termNumber;
	}
	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getInterestingFact() {
		return interestingFact;
	}
	public void setInterestingFact(String interestingFact) {
		this.interestingFact = interestingFact;
	}
	public String getDatesInOffice() {
		return datesInOffice;
	}
	public void setDatesInOffice(String datesInOffice) {
		this.datesInOffice = datesInOffice;
	}
	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	
}
