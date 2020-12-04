package edu.cvtc.java;

/**
 * @author Dylan Espie
 *
 */
public class FinalExam extends GradedActivity {

	//Attributes
	private int numberOfQuestions, numberOfMissed;
	private double pointsEach;
	
	// Overloaded constructor
	public FinalExam(int numberOfQuestions, int numberOfMissed) {
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfMissed = numberOfMissed;
		
		// Calculate to get points based on 100 percent scale
		this.pointsEach = 100/ numberOfQuestions;
		
		// Call the superclass setScore method
		setScore(100.0 -(numberOfMissed * this.pointsEach));
	}

	// Getters
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public int getNumberofMissed() {
		return numberOfMissed;
	}

	public double getPointsEach() {
		return pointsEach;
	}
}
