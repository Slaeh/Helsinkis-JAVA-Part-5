/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heals
 */
public class Book {
    private String author, title;
    private int pageCount;
    
    public Book(String author, String title, int pageCount){
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.pageCount;
    }
    
    public String toString(){
        return this.author + ", " + this.title + ", " + this.pageCount +" pages" ;
    }
}
