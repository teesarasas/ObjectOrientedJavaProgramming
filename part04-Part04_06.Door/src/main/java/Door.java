/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suwat
 */
public class Door {
    private String knock;
    
    public Door() {
        this.knock = "Who's there?";
    }
    public void knock() {
        System.out.println(knock);
    }
}
