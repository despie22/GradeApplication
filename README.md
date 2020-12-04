# GradeApplication
Displays OOP with Java using a Graded Activity class that takes in a single score and returns a letter grade. 
There are 3 classes as unique activities that take in different scores that extend Graded Activity. 

Pass Fail Exam class extends Pass Fail Activity class so when .getGrade for a Pass Fail Exam object is called it will override and be P for pass or F for fail, instead of a letter grade.

The Course Grades class implements the interface Analyzable to require an average score, high score and low score method. This class sets 4 specific activities and has a override toString that returns a formatted string of the scores for the 4 activities and their letter grades.

CourseGradesDemo.java can be run as an example and will have objects that are hard coded in. It will set each activity in the new Course Grades object and will print the toString to the console. The scores can be changed to get a different result in the console.
