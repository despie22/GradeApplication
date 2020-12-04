package edu.cvtc.java;

/**
 * @author Dylan Espie
 *
 */
public class GradedActivity {
	
	// Attribute
	private double score;

	// Setters and Getters
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public char getGrade() {
		
		// Local attribute
		char letterGrade;
		
		// If statements that sets the letter grade
		if(score >=90) {
			letterGrade = 'A';
		}else if(score >=80) {
			letterGrade= 'B';
		}else if(score >=70) {
			letterGrade= 'C';
		}else if(score >=60) {
			letterGrade= 'D';
		}else {
			letterGrade= 'F';
		}
		
		// Return letterGrade
		return letterGrade;
		
	}
}
