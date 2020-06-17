/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heals
 */
public class Cube {
    private int edgeLength =0;
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    public String toString(){
        return "The length of the edge is " + this.edgeLength + " and the volume is " + volume();
    }
}
    
