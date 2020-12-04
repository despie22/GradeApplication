/**
 * 
 */
package edu.cvtc.java;

/**
 * @author Dylan Espie
 *
 */
public class PassFailActivity extends GradedActivity{
	
	
	// Attribute
	private double minimumPassingScore;
	
	// Default constructor
	public PassFailActivity() {
		this.minimumPassingScore = 0.0;
	}
	
	// Overloaded constructor
	public PassFailActivity(double minimumPassingScore) {
		this.minimumPassingScore = minimumPassingScore;
	}
	
	// Override method
	@Override
	public char getGrade() {
		
		// Local attribute
		char letterGrade;
		
		// See if score passes the minimum score
		if(getScore() >= minimumPassingScore) {
			letterGrade = 'P';
		}else {
			letterGrade = 'F';
		}
		
		// Return grade
		return letterGrade;
	}
	
}
