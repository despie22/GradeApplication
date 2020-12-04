/**
 * 
 */
package edu.cvtc.java;

/**
 * @author Dylan Espie
 *
 */
public class Essay extends GradedActivity {

	// Attributes
	private double grammer, spelling, correctLength, content;

	// Getters and Setters
	public double getScore() {
		return super.getScore();
	}
	
	public void setScore(double grammer, double spelling, double correctLength, double content) {
		
		// Sets the points for each grading section
		this.grammer = 15.0;
		this.spelling = 15.0;
		this.correctLength = 20.0;
		this.content = 50.0;
		
		// Sets score for super overloaded constructor
		super.setScore((this.grammer + this.spelling + this.correctLength + this.content) -
				(grammer + spelling + correctLength + content));
	}
	
	public double getGrammer() {
		return grammer;
	}

	public void setGrammer(double grammer) {
		this.grammer = grammer;
	}

	public double getSpelling() {
		return spelling;
	}

	public void setSpelling(double spelling) {
		this.spelling = spelling;
	}

	public double getCorrectLength() {
		return correctLength;
	}

	public void setCorrectLength(double correctLength) {
		this.correctLength = correctLength;
	}

	public double getContent() {
		return content;
	}

	public void setContent(double content) {
		this.content = content;
	}
	
	
}
