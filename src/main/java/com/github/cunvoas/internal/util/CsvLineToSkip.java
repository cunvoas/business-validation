package com.github.cunvoas.internal.util;

public class CsvLineToSkip {
	
	public CsvLineToSkip(int position, String value) {
		this.position=position;
		this.value=value;
	}
	
	private String value;
	private int position;
	
	public String getValue() {
		return value!=null?value:"";
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
