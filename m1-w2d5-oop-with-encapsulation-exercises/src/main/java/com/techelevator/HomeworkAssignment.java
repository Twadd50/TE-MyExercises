package com.techelevator;

public class HomeworkAssignment {															//attributes
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {											//constructor 
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade()	{													
		int percentage = (100 * totalMarks) / possibleMarks;								//logic for letter grades	
		if (percentage >= 90) {
			return "A";
		} else if (percentage >= 80 && percentage < 90) {
			return "B";
		}	else if (percentage >=70 && percentage < 79) {
			return "C";
		}	else if (percentage >= 60 && percentage < 69) {
			return "D";
		}	else  {
			return "F";
		}

}


	public int getTotalMarks() {															//getters/setters
		return totalMarks;																	//
	}																						//
																							//
	public void setTotalMarks(int totalMarks) {												//
		this.totalMarks = totalMarks;														//
	}																						//	
																							//
	public String getSubmitterName() {														//
		return submitterName;																//
	}																						//
																							//
	public void setSubmitterName(String submitterName) {									//
		this.submitterName = submitterName;													//
	}																						//
																							//
	public int getPossibleMarks() {															//
		return possibleMarks;																//getters/setters
	}
}


