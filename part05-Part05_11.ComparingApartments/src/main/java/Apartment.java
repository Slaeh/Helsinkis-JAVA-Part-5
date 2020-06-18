
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        int ownSquare = this.squares;
        int comparedSquare = compared.squares;
        if(ownSquare > comparedSquare){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int ownDifference = this.princePerSquare * this.squares;
        int comparedDifference = compared.princePerSquare * compared.squares;
        if(ownDifference > comparedDifference)return ownDifference - comparedDifference;
        return comparedDifference - ownDifference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int ownPrice = this.princePerSquare;
        int comparedPrice = compared.princePerSquare;
        if(ownPrice > comparedPrice){
            return true;
        }
        return false;
    }

}
