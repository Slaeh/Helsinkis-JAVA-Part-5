/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heals
 */
public class Timer {
    int ones;
    int tens;
    
    public Timer(){
        this.ones = 0;
        this.tens = 0;
    }
    
    public void advance(){
        this.ones++;
        if(this.ones >= 100){
            this.tens++;
            this.ones =0;
            
            if(this.tens >= 100){
                this.tens =0;
                this.ones =0;
            }
        }
    }
    
    public String toString(){
        if(this.tens <= 9 && this.ones <=9){
            return "0" +this.tens + ":0" + this.ones ; 
        }else{
            if(this.tens <= 9 && this.ones >9){
                return "0" +this.tens + ":" + this.ones;
            }else{
               if(this.tens > 9 && this.ones <=9){
                   return this.tens + ":0" + this.ones ;
               } 
            }
        }return this.tens + ":" +this.ones ;
    }
}
            
    
    

