
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identity = scanner.nextLine();
            if(identity.equals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            
            Item newItem = new Item(name,identity);
            if(!(items.contains(newItem))){
                items.add(new Item(name,identity));
            }        
            
        }
        System.out.println("==Items==");
        for(Item i : items){
            System.out.println(i);
        }

    }
}
