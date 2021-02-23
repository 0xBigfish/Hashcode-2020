package utils;
public class Book {
    private int ID; 
    private int score;

    public Book(int ID){
        this.ID = ID;
    }

    public Book(int ID, int score ){
        this.ID = ID;
        this.score = score; 
    }

    public Book(){
    
    }

    public void setScore(int score){
        this.score = score       
    }

    public int getID(){
        return this.ID;
    }
    public int getScore(){
        return this.score; 
    }

    public String toString() {
        return "Book<" + this.ID + ">";
    }
}
