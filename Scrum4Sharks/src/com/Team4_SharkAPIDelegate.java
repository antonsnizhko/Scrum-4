package com;

import javax.jws.WebService;


@WebService (targetNamespace="http://com/", serviceName="Team4_SharkAPIService", portName="Team4_SharkAPIPort")
public class Team4_SharkAPIDelegate{

    com.Team4_SharkAPI _team4_SharkAPI = null;

    public Shark createShark (String name, int teethRows, int length, String habitat) {
        return _team4_SharkAPI.createShark(name,teethRows,length,habitat);
    }

    public Team4_SharkAPIDelegate() {
        _team4_SharkAPI = new com.Team4_SharkAPI(); }

}