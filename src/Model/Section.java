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
public class Section extends Session {

    public Lab lab;
    public TeacherAssistant ta;

     @Override
    public Room getRoom() {
        return lab;
    }

    @Override
    public Teacher getTeacher() {
        return ta;
    }
    
    @Override
    public boolean setTeacher(Teacher ta) {
        if(!(ta instanceof TeacherAssistant)) return false;
        this.ta = (TeacherAssistant) ta;
        return true;
    }

    @Override
    public boolean setRoom(Room lab) {
        if(!(lab instanceof Lab)) return false;
        this.lab = (Lab) lab;
        return true;
    }  
}
