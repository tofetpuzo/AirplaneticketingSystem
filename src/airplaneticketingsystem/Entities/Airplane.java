/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.Entities;

/**
 *
 * @author femitemiola
 */
public class Airplane {
    private final String ModelNumber;
    private final String RegistrationNumber;
    private final int Capacity;

    public Airplane(String ModelNumber, String RegistrationNumber, int Capacity) {
        this.ModelNumber = ModelNumber;
        this.RegistrationNumber = RegistrationNumber;
        this.Capacity = Capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

}
