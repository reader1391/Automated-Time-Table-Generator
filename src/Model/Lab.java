/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author egypt
 */
public class Lab extends Room {
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    
}