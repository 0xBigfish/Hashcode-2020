package utils;
import utils.*;
import java.util.ArrayList; 

public class Simulation {

    private int dayTick; 
    private int maxNumberOfDays;

    private ArrayList<Library> libraries;
    
    public Simulation(){
    
    }
    
    public Simulation(int maxNumberOfDays){
        this.dayTick = 0; 
        this.maxNumberOfDays = maxNumberOfDays;
    }
    
    public void addLibrary(Library library){
        this.libraries.add(library); 
    }

    public ArrayList<Library> getLibraries(){
    
        return libraries; 
    }

    public void setMaxNumberOfDays(int days){
        this.maxNumberOfDays = days;
    
    } 

    public Library getLibrary(int index){
        assert index <= libraries.size() && index >= 0 : "Index unvalid"; 
        return libraries.get(index);
    }

    public void run(){
        System.out.println("Simulation Starting ");
        for(int day=dayTick; day< maxNumberOfDays; day++){
            
            day +=1;
        }
        System.out.println("Simulation Finished ");
    }
}
