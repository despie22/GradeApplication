/**
 * 
 */
package edu.cvtc.java;

/**
 * @author Dylan Espie
 *
 */
public interface Analyzable {

	// Class that implements Analyzable must have 
	// these methods
	public double getAverage();
	public GradedActivity getHighest();
	public GradedActivity getLowest();
	
}
