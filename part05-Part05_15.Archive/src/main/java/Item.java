/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heals
 */
public class Item {
    private String name, identity;
    
    public Item(String name,String identity){
        this.name = name;
        this.identity = identity;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }else{
            if(!(compared instanceof Item)){
                return false;
            }
        }
        Item newItem = (Item) compared;
        return this.identity.equals(newItem.identity);
    }
    
    public String toString(){
        return this.identity + ": " + this.name;
    }
}
