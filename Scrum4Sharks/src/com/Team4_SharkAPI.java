package com;

public class Team4_SharkAPI {

	public Shark createShark(String name, int teethRows, int length, String habitat) {
		return new Shark(name, teethRows, length, habitat);
	}
}

