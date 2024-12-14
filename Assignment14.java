import java.util.*;

public class Assignment14{
    
	public static void main(String[] args) {
	  LinkedList<String> shoppingList=new LinkedList<>();
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter items to add to the shopping list (type 'done' to stop):");
	  while(true){
	       System.out.print("Enter an item: ");
           String item = sc.nextLine();
           if(item.equalsIgnoreCase("done")){
               break;
           }
           System.out.print("Add at (start/end): ");
           String position = sc.nextLine();
           if(position.equalsIgnoreCase("start")){
               shoppingList.addFirst(item);
           }else{
               shoppingList.addLast(item);
           }
	  }
	  System.out.println("Current Shopping List: " + shoppingList);
	  System.out.print("Do you want to remove an item? (yes/no): ");
      String removeResponse = sc.nextLine();
      if(removeResponse.equalsIgnoreCase("yes")){
          System.out.print("Enter the item to remove: ");
          String itemToRemove = sc.nextLine();
          if(shoppingList.remove(itemToRemove)){
               System.out.println("Item '" + itemToRemove + "' removed.");
            } else {
                System.out.println("Item '" + itemToRemove + "' not found in the list.");
          }
      }
      System.out.println("Updated Shopping List: " + shoppingList);
	  

	
	}
}
