/**
 * 
 */
package edu.cvtc.java;


/**
 * @author Dylan Espie
 *
 */
public class CourseGrades implements Analyzable {

	// Constant
	public int NUMBER_OF_GRADES = 4;

	// Attribute
	private GradedActivity[] grades;

	// Default constructor
	public CourseGrades() {
		this.grades = new GradedActivity[NUMBER_OF_GRADES];
	}

	// Set activities
	public void setLab(GradedActivity labActivity) {
		this.grades[0] = labActivity;
	}

	public void setPassFailExam(PassFailExam passFailExam) {
		this.grades[1] = passFailExam;
	}

	public void setEssay(Essay essay) {
		this.grades[2] = essay;
	}

	public void setFinalExam(FinalExam finalExam) {
		this.grades[3] = finalExam;
	}


	// Interface methods
	public double getAverage() {

		// Local attribute
		double average = 0.0;

		// Loop to find average score
		for (int i = 0; i < grades.length; i++) {
			average += grades[i].getScore();

		}
		average /= grades.length;

		// Return average score
		return average;
	}

	public GradedActivity getHighest() {

		// New object to hold score
		GradedActivity high = new GradedActivity();

		// Loop to find highest score
		high = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i].getScore() > high.getScore()) {
				high = grades[i];
			}
		}

		// Return highest score
		return high;
	}

	public GradedActivity getLowest() {

		// New object to hold score
		GradedActivity low = new GradedActivity();

		// Loop to find lowest score
		low = grades[0];
		for (int i = 0; i < grades.length; i ++) {
			if (grades[i].getScore() < low.getScore()) {
				low = grades[i];
			}
		}

		// Return lowest score
		return low;
	}

	// Override toString
	@Override
	public String toString() {

		// Final System.out format
		return "Lab Score: " + grades[0].getScore() + "\n" +
		"  Grade: " + grades[0].getGrade() + "\n\n" +
		"Pass/Fail Exam Score: " + grades[1].getScore()	+ "\n" +
		"  Grade: " + grades[1].getGrade() + "\n\n" +
		"Essay Score: " + grades[2].getScore() + "\n" +
		"  Grade: " + grades[2].getGrade() + "\n\n" +
		"Final Exam Score: " +grades[3].getScore() + "\n" +
		"  Grade: " + grades[3].getGrade() + "\n\n" +
		"Average Score: " + getAverage() + "\n\n" +
		"Highest Score: " + getHighest().getScore() + "\n\n" +
		"Lowest Score: " + getLowest().getScore();
	}
}
