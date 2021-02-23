package utils;
import java.util.ArrayList;

import utils.*;

public class Library{
    private ArrayList<Book> books;  // array of ids of books  
    private int time; // days to register library 
    private int DailyScannable; // How many can scan per day ? 
    private boolean regestering;

    public Library(int time, int DailyScannable) {
        this.books = new ArrayList<Book>(); 
        this.time  = time; 
        this.DailyScannable = DailyScannable;
    }
    

    public void addBook(Book book){
        this.books.add(book);
    }
    
    public void setbooks(ArrayList<Book> books){
        this.books = books;
    }
    public ArrayList<Book> getBooks(){
        return this.books; 
    }

    public int getTime(){
        return this.time; 
    }

    public boolean isRegestering(){
       return this.regestering;
    }

    public int getDailyScannable(){
        return this.DailyScannable;
    }
}

