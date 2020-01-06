package com.wansoft.objects;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeObj {
	/**
	 * the List interface is parameterizable
	 * I crate a list of String(the String class is the parameter)
	 */
	public List<String> values = new ArrayList<String>();

	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}	
}
