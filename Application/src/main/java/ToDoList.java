import java.util.ArrayList;

public class ToDoList {

    //arrayList of Items object that creates a full todoList
    private ArrayList<Item> toDoList;
    //String title name of list
    private String listTitle;

    //returns the list
    public ArrayList<Item> getToDoList(){
        return toDoList;
    }

    //gets title of list
    public String getListTitle(){
        return listTitle;
    }

    public void addItem(){
        //adds a new item to toDoList
    }

    public void removeItem(){
        //removes item from toDoList
    }

    public void displayAllItems(){
        //prints all the items on list to user in fxml
    }

    //displays completed items
    public void displayCompletedItems(){
        //for all the items in the list
        //if Item is completed
        //print item on the fxml
    }

    public void displayIncompletedItems(){
        //for all the items in the list
        //if item is not completed
        //print item on the fxml
    }


    //save all highlighted lists to txt file
    public void save(){
        //prompt user to location and name of file
        //to save arraylist into text file
    }

}
