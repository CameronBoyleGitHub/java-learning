import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    // Using ArrayList.add() to dynamically add items to resizable vector
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // Using ArrayList.get() to retrieve data
    public void printGroceryList() {
        System.out.println("Currently there are: " + groceryList.size() + " items.");
        for (int i = 0; i < groceryList.size(); ++i) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
    // Using ArrayList.set(positionInList, objectToAdd) to modify data
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }
    // Using ArrayList.remove(index) to remove ArrayList object
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    // Using ArrayList.indexOf(index) to find item within data
    public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
