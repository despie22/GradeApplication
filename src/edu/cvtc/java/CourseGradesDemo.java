/**
 * 
 */
package edu.cvtc.java;


/**
 * @author Dylan Espie
 *
 */
public class CourseGradesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create GradedActivity object
		// and set the score
		GradedActivity labActivity = new GradedActivity();
		labActivity.setScore(85.0);
		
		// Create a PassFailExam object passing in values
		PassFailExam passFail = new PassFailExam(70.0, 20, 3);
		
		// Create a Essay object
		// and set the amount missed for each category
		Essay essay = new Essay();
		essay.setScore(5.0, 5.0, 5.0, 10.0);
		
		// Create FinalExam object
		FinalExam finalExam = new FinalExam(50, 10);
		
		// Create CourseGrades object
		CourseGrades grades = new CourseGrades();
		
		// Add each object to their respective setter
		grades.setLab(labActivity);
		grades.setPassFailExam(passFail);
		grades.setEssay(essay);
		grades.setFinalExam(finalExam);
		
		// Print out toString
		System.out.print(grades.toString());
		
	}
}
