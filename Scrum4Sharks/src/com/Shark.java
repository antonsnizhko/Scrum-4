package com;

public class Shark {

	private String name;
	private int rowsOfTeeth;
	private int averageLength;
	private String habitat;
	
	public Shark() {
		this.name = "";
		this.rowsOfTeeth = 0;
		this.averageLength = 0;
		this.habitat = "";
	}
	
	public Shark(String name, int rowsOfTeeth, int averageLength, String habitat) {
		super();
		this.name = name;
		this.rowsOfTeeth = rowsOfTeeth;
		this.averageLength = averageLength;
		this.habitat = habitat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRowsOfTeeth() {
		return rowsOfTeeth;
	}
	public void setRowsOfTeeth(int rowsOfTeeth) {
		this.rowsOfTeeth = rowsOfTeeth;
	}
	public int getAverageLength() {
		return averageLength;
	}
	public void setAverageLength(int averageLength) {
		this.averageLength = averageLength;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String toString() {
		String rString = "Name: " + this.name + "\n Rows of Teeth: " + this.rowsOfTeeth + "\n Average Length: " + this.averageLength + "\n Habitat: " + this.habitat;
		return rString;
	}
	
}