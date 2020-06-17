
public class HealthStation {
    private int counter;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        counter++;
        return person.getWeight();
        
    }
    
    public void feed(Person person){
        int add = person.getWeight()+1;
        person.setWeight(add); 
        
    }
    
    public int weighings(){
        return counter;
    }
}
