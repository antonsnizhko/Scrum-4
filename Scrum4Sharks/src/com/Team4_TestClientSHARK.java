package com;

public class Team4_TestClientSHARK {
	Team4_SharkAPI api = new Team4_SharkAPI();
	
	public Shark MakeNewShark(String name, int teeth, int length, String location) {
		return api.createShark(name, teeth, length, location);
	}
}


