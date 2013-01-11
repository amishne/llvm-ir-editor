package com.intel.llvm.ireditor;

public class NumberedName {
	private final String prefix;
	private final int num;

	public NumberedName(String prefix, int num) {
		this.prefix = prefix;
		this.num = num;
	}

	public int getNumber() {
		return num;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public String toString() {
		return prefix + num;
	}

}
