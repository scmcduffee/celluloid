package org.celluloidlang.core;

import org.celluloidlang.constraints.defined.*;

public class ConstraintFunction {
	
	protected Input input;
	private double time;
	
	public ConstraintFunction(Input input, double executeTime) {
		this.input = input;
		this.time = executeTime;
	}
	
	public Input getInput() {
		return input;
	}
	
	public double getTime() {
		return time;
	}
	
	/**
	 * need to overwrite this function (anonymous function)
	 */
	public void execute() {}

}
