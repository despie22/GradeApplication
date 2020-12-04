package edu.cvtc.java;

public class PassFailExam extends PassFailActivity {
	
	// Attributes
	 private int numberOfQuestions, numberOfMissed;
	 private double pointEach;
	 
	// Overloaded constructor
	public PassFailExam(double minimumPassingScore, int numberOfQuestions, int numberOfMissed) {
		
		// Sets super overloaded constructor
		super(minimumPassingScore);
		
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfMissed = numberOfMissed;
		
		// Calculate to get points based on 100 percent
		this.pointEach = 100.0 /numberOfQuestions;
		
		// Call the superclass setScore method to set the total score
		// out of 100 percent
		setScore(100.0 -(numberOfMissed * pointEach));
	}
	
	// Getters
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public int getNumberOfMissed() {
		return numberOfMissed;
	}

	public double getPointEach() {
		return pointEach;
	}
	 
}
